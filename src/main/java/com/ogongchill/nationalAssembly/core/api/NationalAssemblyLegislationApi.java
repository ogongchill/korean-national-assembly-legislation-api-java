package com.ogongchill.nationalAssembly.core.api;

import com.ogongchill.nationalAssembly.core.request.*;
import com.ogongchill.nationalAssembly.core.response.*;

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
