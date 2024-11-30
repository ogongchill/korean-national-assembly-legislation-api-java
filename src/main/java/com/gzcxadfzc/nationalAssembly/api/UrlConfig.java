package com.gzcxadfzc.nationalAssembly.api;

import okhttp3.HttpUrl;

public class UrlConfig {
    private static final HttpUrl BASE_URL_BUILDER = new HttpUrl.Builder()
            .scheme("https")
            .host("apis.data.go.kr")
            .addPathSegment("9710000")
            .addPathSegment("BillInfoService2")
            .build();

    private static HttpUrl.Builder getBaseUrlBuilder() {
        return BASE_URL_BUILDER.newBuilder();
    }

    public static HttpUrl.Builder getBillInfoListURLBuilder() {
        return getBaseUrlBuilder().addEncodedPathSegment("getBillInfoList");
    }

    public static HttpUrl.Builder getBillPetitionMemberListURLBuilder() {
        return getBaseUrlBuilder().addEncodedPathSegment("getBillPetitionMemberList");
    }
}
