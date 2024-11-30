package com.gzcxadfzc.nationalAssembly.api.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.gzcxadfzc.nationalAssembly.api.exception.UnexpectedResponseException;
import com.gzcxadfzc.nationalAssembly.response.common.PublicDataNationalAssemblyResponse;

public class XmlParser {
    private static final XmlMapper MAPPER = new XmlMapper();

    public static <T> PublicDataNationalAssemblyResponse<T> parse(String data) {
        try {
            TypeReference<PublicDataNationalAssemblyResponse<T>> typeReference = new TypeReference<>() {};
            return MAPPER.readValue(data, typeReference);
        } catch (JsonProcessingException e) {
            throw new UnexpectedResponseException(e, data, PublicDataNationalAssemblyResponse.class.descriptorString());
        }
    }
}
