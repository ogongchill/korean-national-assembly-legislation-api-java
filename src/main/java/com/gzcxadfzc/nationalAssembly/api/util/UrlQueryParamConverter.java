package com.gzcxadfzc.nationalAssembly.api.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.Request;

import java.util.Map;

public class UrlQueryParamConverter {
    public static final ObjectMapper MAPPER = new ObjectMapper();

    public static Request createRequest(HttpUrl.Builder builder, Object requestData) {
        MAPPER.convertValue(requestData, new TypeReference<Map<String, Object>>() {})
                .forEach((key, value) -> builder.addQueryParameter(key, value.toString()));
        return new Request.Builder()
                .url(builder.build())
                .build();
    }
}
