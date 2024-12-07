package com.ogongchill.nationalAssembly.core.api.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.ogongchill.nationalAssembly.core.api.exception.ApiErrorException;
import com.ogongchill.nationalAssembly.core.api.exception.UnexpectedResponseException;
import com.ogongchill.nationalAssembly.core.response.error.ErrorResponse;

public class XmlParser {
    private static final XmlMapper MAPPER = new XmlMapper();

    public <T> T parse(String data, Class<T> type) {
        try {
            throwIfErrorResponse(data);
            return MAPPER.readValue(data, type);
        } catch (JsonProcessingException e) {
            throw new UnexpectedResponseException(e, data, type.getCanonicalName());
        }
    }

    private static void throwIfErrorResponse(String data) throws JsonProcessingException {
        JsonNode jsonNode = MAPPER.readTree(data);
        if(jsonNode.has("cmmMsgHeader")) {
            ErrorResponse errorResponse = MAPPER.readValue(data, ErrorResponse.class);
            throw new ApiErrorException(errorResponse);
        }
    }
}
