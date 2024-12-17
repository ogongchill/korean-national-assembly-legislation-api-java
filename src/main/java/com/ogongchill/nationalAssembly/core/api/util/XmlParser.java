package com.ogongchill.nationalAssembly.core.api.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.ogongchill.nationalAssembly.core.api.exception.ApiErrorException;
import com.ogongchill.nationalAssembly.core.api.exception.UnexpectedResponseException;
import com.ogongchill.nationalAssembly.core.response.common.DetailHeader;
import com.ogongchill.nationalAssembly.core.response.error.ErrorHeader;
import com.ogongchill.nationalAssembly.core.response.error.ErrorResponse;

public class XmlParser {

    private static final XmlMapper MAPPER = new XmlMapper();

    private XmlParser() { // no instances
    }

    public static <T> T parse(String data, Class<T> type) {
        try {
            throwIfErrorResponse(data);
            return MAPPER.readValue(data, type);
        } catch (JsonProcessingException e) {
            throw new UnexpectedResponseException(e, data, type);
        }
    }

    private static void  throwIfErrorResponse(String data) throws JsonProcessingException {
        JsonNode jsonNode = MAPPER.readTree(data);
        throwIfCmmMsgHeader(data, jsonNode);
        throwIfEmpty(jsonNode);
        throwIfInvalidResultCode(jsonNode);
    }

    private static void throwIfCmmMsgHeader(String data, JsonNode jsonNode) throws JsonProcessingException {
        if(jsonNode.has("cmmMsgHeader")) {
            ErrorResponse errorResponse = MAPPER.readValue(data, ErrorResponse.class);
            ErrorHeader errorHeader = errorResponse.getErrorHeader();
            throw new ApiErrorException(errorHeader.getReturnAuthMsg(), Integer.parseInt(errorHeader.getReturnReasonCode()));
        }
    }

    private static void throwIfInvalidResultCode(JsonNode jsonNode) throws JsonProcessingException {
        if(jsonNode.has("header")) {
            JsonNode jsonNodeHeader = jsonNode.get("header");
            String xmlString = MAPPER.writeValueAsString(jsonNodeHeader);
            DetailHeader header = MAPPER.readValue(xmlString, DetailHeader.class);
            if(header.getCode() != 0) {
                throw new ApiErrorException(header.getMessage(), header.getCode());
            }
        }
    }

    private static void throwIfEmpty(JsonNode jsonNode) {
        if(jsonNode.isEmpty()) {
            throw new ApiErrorException("response with emptyBody", -1);
        }
    }
}
