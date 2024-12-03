package com.gzcxadfzc.nationalAssembly.api;

import com.gzcxadfzc.nationalAssembly.api.util.UrlQueryParamConverter;
import com.gzcxadfzc.nationalAssembly.api.util.XmlParser;
import com.gzcxadfzc.nationalAssembly.request.*;
import com.gzcxadfzc.nationalAssembly.response.*;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class NationalAssemblyLegislationService implements NationalAssemblyLegislationApi {
    private static final XmlParser XML_PARSER = new XmlParser();
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
    public BillInfoListResponse getBillInfoList(BillInfoListRequest request) {
        Request billInfoListRequest = UrlQueryParamConverter.createRequest(UrlConfig.getBillInfoListUrlBuilder(), request);
        String responseBody = client.getResponseBodyString(billInfoListRequest);
        return XML_PARSER.parse(responseBody, BillInfoListResponse.class);
    }

    @Override
    public RecentRceptListResponse getRecentRceptList(RecentRceptListRequest request) {
        Request recentRceptListRequest = UrlQueryParamConverter.createRequest(UrlConfig.getRecentRceptListUrlBuilder(), request);
        String responseBody = client.getResponseBodyString(recentRceptListRequest);
        return XML_PARSER.parse(responseBody, RecentRceptListResponse.class);
    }

    @Override
    public RecentPasageListResponse getRecentPasageList(RecentPasageListRequest request) {
        Request recentPasageListRequest = UrlQueryParamConverter.createRequest(UrlConfig.getRecentPasageListUrlBuilder(), request);
        String responseBody = client.getResponseBodyString(recentPasageListRequest);
        return XML_PARSER.parse(responseBody, RecentPasageListResponse.class);
    }

    @Override
    public JsictionComiteProcessListResponse getJsictionComiteProcessList(JsictionComiteProcessListRequest request) {
        Request jsictionCmiteProcessListRequest = UrlQueryParamConverter.createRequest(UrlConfig.getJsictionComiteeProcessListUrlBuilder(), request);
        String responseBody = client.getResponseBodyString(jsictionCmiteProcessListRequest);
        return XML_PARSER.parse(responseBody, JsictionComiteProcessListResponse.class);
    }

    @Override
    public RecentMoorListResponse getRecentMoorList(RecentMoorListRequest request) {
        Request recentMoorListRequest = UrlQueryParamConverter.createRequest(UrlConfig.getRecentMoorListUrlBuilder(), request);
        String responseBody = client.getResponseBodyString(recentMoorListRequest);
        return XML_PARSER.parse(responseBody, RecentMoorListResponse.class);
    }

    @Override
    public SessionRequestResponse getSessionRequestList(SessionRequestListRequest request) {
        Request sessionRequestListRequest = UrlQueryParamConverter.createRequest(UrlConfig.getSessionRequestListUrlBuilder(), request);
        String responseBody = client.getResponseBodyString(sessionRequestListRequest);
        return XML_PARSER.parse(responseBody, SessionRequestResponse.class);
    }

    @Override
    public BillReceiptInfoResponse getBillReceiptInfo(BillReceiptInfoRequest request) {
        Request billReceiptInfoRequest = UrlQueryParamConverter.createRequest(UrlConfig.getBillReceiptInfoListUrlBuilder(), request);
        String responseBody = client.getResponseBodyString(billReceiptInfoRequest);
        return XML_PARSER.parse(responseBody, BillReceiptInfoResponse.class);
    }

    @Override
    public BillPetitionMemberListResponse getBillPetitionMemberList(BillPetitionMemberListRequest request) {
        Request billPetitionMemberListRequest = UrlQueryParamConverter.createRequest(UrlConfig.getBillPetitionMemberListURLBuilder(), request);
        String responseBody = client.getResponseBodyString(billPetitionMemberListRequest);
        return XML_PARSER.parse(responseBody, BillPetitionMemberListResponse.class);
    }
}
