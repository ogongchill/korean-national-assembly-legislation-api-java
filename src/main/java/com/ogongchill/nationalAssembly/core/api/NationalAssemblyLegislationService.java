package com.ogongchill.nationalAssembly.core.api;

import com.ogongchill.nationalAssembly.core.api.util.UrlQueryParamConverter;
import com.ogongchill.nationalAssembly.core.api.util.XmlParser;
import com.ogongchill.nationalAssembly.core.request.*;
import com.ogongchill.nationalAssembly.core.response.*;
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
        Request billInfoListRequest = UrlQueryParamConverter.createRequest(Operation.getBillInfoList, request);
        String responseBody = client.getResponseBodyString(billInfoListRequest);
        return XML_PARSER.parse(responseBody, BillInfoListResponse.class);
    }

    @Override
    public RecentRceptListResponse getRecentRceptList(RecentRceptListRequest request) {
        Request recentRceptListRequest = UrlQueryParamConverter.createRequest(Operation.getRecentRceptList, request);
        String responseBody = client.getResponseBodyString(recentRceptListRequest);
        return XML_PARSER.parse(responseBody, RecentRceptListResponse.class);
    }

    @Override
    public RecentPasageListResponse getRecentPasageList(RecentPasageListRequest request) {
        Request recentPasageListRequest = UrlQueryParamConverter.createRequest(Operation.getRecentPasageList, request);
        String responseBody = client.getResponseBodyString(recentPasageListRequest);
        return XML_PARSER.parse(responseBody, RecentPasageListResponse.class);
    }

    @Override
    public JsictionComiteProcessListResponse getJsictionComiteProcessList(JsictionComiteProcessListRequest request) {
        Request jsictionCmiteProcessListRequest = UrlQueryParamConverter.createRequest(Operation.getJsictionComiteProcessList, request);
        String responseBody = client.getResponseBodyString(jsictionCmiteProcessListRequest);
        return XML_PARSER.parse(responseBody, JsictionComiteProcessListResponse.class);
    }

    @Override
    public RecentMoorListResponse getRecentMoorList(RecentMoorListRequest request) {
        Request recentMoorListRequest = UrlQueryParamConverter.createRequest(Operation.getRecentMoorList, request);
        String responseBody = client.getResponseBodyString(recentMoorListRequest);
        return XML_PARSER.parse(responseBody, RecentMoorListResponse.class);
    }

    @Override
    public SessionRequestResponse getSessionRequestList(SessionRequestListRequest request) {
        Request sessionRequestListRequest = UrlQueryParamConverter.createRequest(Operation.getSessionRequestList, request);
        String responseBody = client.getResponseBodyString(sessionRequestListRequest);
        return XML_PARSER.parse(responseBody, SessionRequestResponse.class);
    }

    @Override
    public BillReceiptInfoResponse getBillReceiptInfo(BillReceiptInfoRequest request) {
        Request billReceiptInfoRequest = UrlQueryParamConverter.createRequest(Operation.getBillReceiptInfo, request);
        String responseBody = client.getResponseBodyString(billReceiptInfoRequest);
        return XML_PARSER.parse(responseBody, BillReceiptInfoResponse.class);
    }

    @Override
    public BillPetitionMemberListResponse getBillPetitionMemberList(BillPetitionMemberListRequest request) {
        Request billPetitionMemberListRequest = UrlQueryParamConverter.createRequest(Operation.getBillPetitionMemberList, request);
        String responseBody = client.getResponseBodyString(billPetitionMemberListRequest);
        return XML_PARSER.parse(responseBody, BillPetitionMemberListResponse.class);
    }

    @Override
    public BillPromulgationInfoResponse getBillPromulgationInfo(BillPromulgationInfoRequest request) {
        Request billPromulgationInfoRequest = UrlQueryParamConverter.createRequest(Operation.getBillPromulgationInfo, request);
        String responseBody = client.getResponseBodyString(billPromulgationInfoRequest);
        return XML_PARSER.parse(responseBody, BillPromulgationInfoResponse.class);
    }
}
