package com.ogongchill.nationalAssembly.core.api;

import com.ogongchill.nationalAssembly.core.api.util.UrlQueryParamConverter;
import com.ogongchill.nationalAssembly.core.api.util.XmlParser;
import com.ogongchill.nationalAssembly.core.request.BillInfoListRequest;
import com.ogongchill.nationalAssembly.core.request.BillPetitionMemberListRequest;
import com.ogongchill.nationalAssembly.core.request.BillPromulgationInfoRequest;
import com.ogongchill.nationalAssembly.core.request.BillReceiptInfoRequest;
import com.ogongchill.nationalAssembly.core.request.JsictionComiteProcessListRequest;
import com.ogongchill.nationalAssembly.core.request.RecentMoorListRequest;
import com.ogongchill.nationalAssembly.core.request.RecentPasageListRequest;
import com.ogongchill.nationalAssembly.core.request.RecentRceptListRequest;
import com.ogongchill.nationalAssembly.core.request.SessionRequestListRequest;
import com.ogongchill.nationalAssembly.core.response.BillInfoListResponse;
import com.ogongchill.nationalAssembly.core.response.BillPetitionMemberListResponse;
import com.ogongchill.nationalAssembly.core.response.BillPromulgationInfoResponse;
import com.ogongchill.nationalAssembly.core.response.BillReceiptInfoResponse;
import com.ogongchill.nationalAssembly.core.response.JsictionComiteProcessListResponse;
import com.ogongchill.nationalAssembly.core.response.RecentMoorListResponse;
import com.ogongchill.nationalAssembly.core.response.RecentPasageListResponse;
import com.ogongchill.nationalAssembly.core.response.RecentRceptListResponse;
import com.ogongchill.nationalAssembly.core.response.SessionRequestResponse;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class NationalAssemblyLegislationService implements NationalAssemblyLegislationApi {

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
        Request billInfoListRequest = UrlQueryParamConverter.createRequest(Operation.GET_BILL_INFO_LIST, request);
        String responseBody = client.getResponseBodyString(billInfoListRequest);
        return XmlParser.parse(responseBody, BillInfoListResponse.class);
    }

    @Override
    public RecentRceptListResponse getRecentRceptList(RecentRceptListRequest request) {
        Request recentRceptListRequest = UrlQueryParamConverter.createRequest(Operation.GET_RECENT_RCEPT_LIST, request);
        String responseBody = client.getResponseBodyString(recentRceptListRequest);
        return XmlParser.parse(responseBody, RecentRceptListResponse.class);
    }

    @Override
    public RecentPasageListResponse getRecentPasageList(RecentPasageListRequest request) {
        Request recentPasageListRequest = UrlQueryParamConverter.createRequest(Operation.GET_RECENT_PASAGE_LIST, request);
        String responseBody = client.getResponseBodyString(recentPasageListRequest);
        return XmlParser.parse(responseBody, RecentPasageListResponse.class);
    }

    @Override
    public JsictionComiteProcessListResponse getJsictionComiteProcessList(JsictionComiteProcessListRequest request) {
        Request jsictionCmiteProcessListRequest = UrlQueryParamConverter.createRequest(Operation.GET_JSICTION_COMITE_PROCESS_LIST, request);
        String responseBody = client.getResponseBodyString(jsictionCmiteProcessListRequest);
        return XmlParser.parse(responseBody, JsictionComiteProcessListResponse.class);
    }

    @Override
    public RecentMoorListResponse getRecentMoorList(RecentMoorListRequest request) {
        Request recentMoorListRequest = UrlQueryParamConverter.createRequest(Operation.GET_RECENT_MOOR_LIST, request);
        String responseBody = client.getResponseBodyString(recentMoorListRequest);
        return XmlParser.parse(responseBody, RecentMoorListResponse.class);
    }

    @Override
    public SessionRequestResponse getSessionRequestList(SessionRequestListRequest request) {
        Request sessionRequestListRequest = UrlQueryParamConverter.createRequest(Operation.GET_SESSION_REQUEST_LIST, request);
        String responseBody = client.getResponseBodyString(sessionRequestListRequest);
        return XmlParser.parse(responseBody, SessionRequestResponse.class);
    }

    @Override
    public BillReceiptInfoResponse getBillReceiptInfo(BillReceiptInfoRequest request) {
        Request billReceiptInfoRequest = UrlQueryParamConverter.createRequest(Operation.GET_BILL_RECEIPT_INFO, request);
        String responseBody = client.getResponseBodyString(billReceiptInfoRequest);
        return XmlParser.parse(responseBody, BillReceiptInfoResponse.class);
    }

    @Override
    public BillPetitionMemberListResponse getBillPetitionMemberList(BillPetitionMemberListRequest request) {
        Request billPetitionMemberListRequest = UrlQueryParamConverter.createRequest(Operation.GET_BILL_PETITION_MEMBER_LIST, request);
        String responseBody = client.getResponseBodyString(billPetitionMemberListRequest);
        return XmlParser.parse(responseBody, BillPetitionMemberListResponse.class);
    }

    @Override
    public BillPromulgationInfoResponse getBillPromulgationInfo(BillPromulgationInfoRequest request) {
        Request billPromulgationInfoRequest = UrlQueryParamConverter.createRequest(Operation.GET_BILL_PROMULGATION_INFO, request);
        String responseBody = client.getResponseBodyString(billPromulgationInfoRequest);
        return XmlParser.parse(responseBody, BillPromulgationInfoResponse.class);
    }
}
