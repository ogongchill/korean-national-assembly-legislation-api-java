package com.joebakk.nationalAssembly.api;

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

    public static HttpUrl.Builder getBillInfoListUrlBuilder() {
        return getBaseUrlBuilder().addEncodedPathSegment(Operation.getBillInfoList.name());
    }

    public static HttpUrl.Builder getRecentRceptListUrlBuilder() {
        return getBaseUrlBuilder().addEncodedPathSegment(Operation.getRecentRceptList.name());
    }

    public static HttpUrl.Builder getRecentPasageListUrlBuilder() {
        return getBaseUrlBuilder().addEncodedPathSegment(Operation.getRecentPasageList.name());
    }

    public static HttpUrl.Builder getJsictionComiteeProcessListUrlBuilder() {
        return  getBaseUrlBuilder().addEncodedPathSegment(Operation.getJsictionComiteProcessList.name());
    }

    public static HttpUrl.Builder getRecentMoorListUrlBuilder() {
        return getBaseUrlBuilder().addEncodedPathSegment(Operation.getRecentMoorList.name());
    }

    public static HttpUrl.Builder getSessionRequestListUrlBuilder() {
        return getBaseUrlBuilder().addEncodedPathSegment(Operation.getSessionRequestList.name());
    }

    public static HttpUrl.Builder getBillReceiptInfoListUrlBuilder() {
        return getBaseUrlBuilder().addEncodedPathSegment(Operation.getBillReceiptInfo.name());
    }

    public static HttpUrl.Builder getBillPetitionMemberListURLBuilder() {
        return getBaseUrlBuilder().addEncodedPathSegment(Operation.getBillPetitionMemberList.name());
    }

    public static HttpUrl.Builder getUrlBuilder(Operation operation) {
        return getBaseUrlBuilder().addPathSegment(operation.name());
    }
}
