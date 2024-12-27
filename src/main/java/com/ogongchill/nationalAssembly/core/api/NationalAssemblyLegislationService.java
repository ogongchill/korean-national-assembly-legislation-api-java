package com.ogongchill.nationalAssembly.core.api;

import com.ogongchill.nationalAssembly.core.api.util.UrlQueryParamConverter;
import com.ogongchill.nationalAssembly.core.api.util.XmlParser;
import com.ogongchill.nationalAssembly.core.request.*;
import com.ogongchill.nationalAssembly.core.response.*;

import com.ogongchill.nationalAssembly.core.response.billAdditionalInfo.BillAdditionalInfoResponse;
import com.ogongchill.nationalAssembly.core.response.billCommissionExaminationInfo.BillCommissionExaminationInfoResponse;
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
        return executeApiCall(Operation.GET_BILL_INFO_LIST, request, BillInfoListResponse.class);
    }

    @Override
    public RecentRceptListResponse getRecentRceptList(RecentRceptListRequest request) {
        return executeApiCall(Operation.GET_RECENT_RCEPT_LIST, request, RecentRceptListResponse.class);
    }

    @Override
    public RecentPasageListResponse getRecentPasageList(RecentPasageListRequest request) {
        return executeApiCall(Operation.GET_RECENT_PASAGE_LIST, request, RecentPasageListResponse.class);
    }

    @Override
    public JsictionComiteProcessListResponse getJsictionComiteProcessList(JsictionComiteProcessListRequest request) {
        return executeApiCall(Operation.GET_JSICTION_COMITE_PROCESS_LIST, request, JsictionComiteProcessListResponse.class);
    }

    @Override
    public RecentMoorListResponse getRecentMoorList(RecentMoorListRequest request) {
        return executeApiCall(Operation.GET_RECENT_MOOR_LIST, request, RecentMoorListResponse.class);
    }

    @Override
    public SessionRequestListResponse getSessionRequestList(SessionRequestListRequest request) {
        return executeApiCall(Operation.GET_SESSION_REQUEST_LIST, request, SessionRequestListResponse.class);
    }

    @Override
    public BillReceiptInfoResponse getBillReceiptInfo(BillReceiptInfoRequest request) {
        return executeApiCall(Operation.GET_BILL_RECEIPT_INFO, request, BillReceiptInfoResponse.class);
    }

    @Override
    public BillPetitionMemberListResponse getBillPetitionMemberList(BillPetitionMemberListRequest request) {
        return executeApiCall(Operation.GET_BILL_PETITION_MEMBER_LIST, request, BillPetitionMemberListResponse.class);
    }

    @Override
    public BillPromulgationInfoResponse getBillPromulgationInfo(BillPromulgationInfoRequest request) {
        return executeApiCall(Operation.GET_BILL_PROMULGATION_INFO, request, BillPromulgationInfoResponse.class);
    }

    @Override
    public BillAdditionalInfoResponse getBillAdditionalInfo(BillAdditionalInfoRequest request) {
        return executeApiCall(Operation.GET_BILL_ADDITIONAL_INFO, request, BillAdditionalInfoResponse.class);
    }

    @Override
    public BillCommissionExaminationInfoResponse getBillCommissionExaminationInfo(BillCommissionExaminationInfoRequest request) {
        return executeApiCall(Operation.GET_BILL_COMMISSION_EXAMINATION_INFO, request, BillCommissionExaminationInfoResponse.class);
    }

    @Override
    public CommitPetitionListResponse getCommitPetitionList(CommitPetitionListRequest request) {
        return executeApiCall(Operation.GET_COMMIT_PETITION_LIST, request, CommitPetitionListResponse.class);
    }

    @Override
    public MotionLawListResponse getMotionLawList(MotionLawListRequest request) {
        return executeApiCall(Operation.GET_MOTION_LAW_LIST, request, MotionLawListResponse.class);
    }

    private <T, R> T executeApiCall(Operation operation, R request, Class<T> responseType) {
        Request apiRequest = UrlQueryParamConverter.createRequest(operation, request);
        String responseBody = client.getResponseBodyString(apiRequest);
        return XmlParser.parse(responseBody, responseType);
    }
}
