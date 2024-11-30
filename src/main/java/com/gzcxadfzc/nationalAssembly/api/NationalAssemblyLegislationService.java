package com.gzcxadfzc.nationalAssembly.api;

import com.gzcxadfzc.nationalAssembly.api.util.HttpRequestConverter;
import com.gzcxadfzc.nationalAssembly.api.util.XmlParser;
import com.gzcxadfzc.nationalAssembly.request.BillInfoListRequest;
import com.gzcxadfzc.nationalAssembly.response.common.PublicDataNationalAssemblyResponse;
import com.gzcxadfzc.nationalAssembly.response.item.RecentBillItem;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class NationalAssemblyLegislationService implements NationalAssemblyLegislationInfoApi {
    private final HttpClient client;

    private NationalAssemblyLegislationService(HttpClient client) {
        this.client = client;
    }

    public static NationalAssemblyLegislationService from(String serviceKey, OkHttpClient client) {
        OkHttpClient authenticateClient = client.newBuilder()
                .addInterceptor(new AuthenticationInterceptor(serviceKey))
                .build();
        return new NationalAssemblyLegislationService(new HttpClient(authenticateClient));
    }

    @Override
    public PublicDataNationalAssemblyResponse<RecentBillItem> getRecentBill(BillInfoListRequest request) {
        Request recentBillListRequest = HttpRequestConverter.createBillInfoListRequest(request);
        return getResponse(recentBillListRequest);
    }

    private <T> PublicDataNationalAssemblyResponse<T> getResponse(Request request) {
        String responseBody = client.getResponseBodyString(request);
        return XmlParser.parse(responseBody);
    }
}
