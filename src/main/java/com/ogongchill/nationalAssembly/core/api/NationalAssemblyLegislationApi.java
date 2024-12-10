package com.ogongchill.nationalAssembly.core.api;

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

public interface
NationalAssemblyLegislationApi {
    BillInfoListResponse getBillInfoList(BillInfoListRequest request);
    RecentRceptListResponse getRecentRceptList(RecentRceptListRequest request);
    RecentPasageListResponse getRecentPasageList(RecentPasageListRequest request);
    JsictionComiteProcessListResponse getJsictionComiteProcessList(JsictionComiteProcessListRequest request);
    RecentMoorListResponse getRecentMoorList(RecentMoorListRequest request);
    SessionRequestResponse getSessionRequestList(SessionRequestListRequest request);
    BillReceiptInfoResponse getBillReceiptInfo(BillReceiptInfoRequest request);
    BillPetitionMemberListResponse getBillPetitionMemberList(BillPetitionMemberListRequest request);
    BillPromulgationInfoResponse getBillPromulgationInfo(BillPromulgationInfoRequest request);
}
