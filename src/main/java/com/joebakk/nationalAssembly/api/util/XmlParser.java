package com.joebakk.nationalAssembly.api.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.joebakk.nationalAssembly.api.exception.UnexpectedResponseException;

public class XmlParser {
    private static final XmlMapper MAPPER = new XmlMapper();

    public <T> T parse(String data, Class<T> type) {
        try {
            return MAPPER.readValue(data, type);
        } catch (JsonProcessingException e) {
            throw new UnexpectedResponseException(e, data, type.getCanonicalName());
        }
    }
}
