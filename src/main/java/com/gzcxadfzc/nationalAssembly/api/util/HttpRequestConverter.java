package com.gzcxadfzc.nationalAssembly.api.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gzcxadfzc.nationalAssembly.api.UrlConfig;
import com.gzcxadfzc.nationalAssembly.request.BillInfoListRequest;
import okhttp3.HttpUrl;
import okhttp3.Request;

import java.util.Map;

public class HttpRequestConverter {
    public static final ObjectMapper MAPPER = new ObjectMapper();

    public static Request createBillInfoListRequest(BillInfoListRequest billInfoListRequest) {
        return createRequest(UrlConfig.getBillInfoListURLBuilder(), billInfoListRequest);
    }

    private static Request createRequest(HttpUrl.Builder builder, Object requestData) {
        MAPPER.convertValue(requestData, new TypeReference<Map<String, Object>>() {})
                .forEach((key, value) -> builder.addQueryParameter(key, value.toString()));
        return new Request.Builder()
                .url(builder.build())
                .build();
    }
}
