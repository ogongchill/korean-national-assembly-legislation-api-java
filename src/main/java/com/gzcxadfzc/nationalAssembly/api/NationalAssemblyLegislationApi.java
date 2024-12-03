package com.gzcxadfzc.nationalAssembly.api;

import com.gzcxadfzc.nationalAssembly.request.*;
import com.gzcxadfzc.nationalAssembly.response.*;

public interface NationalAssemblyLegislationApi {
    BillInfoListResponse getBillInfoList(BillInfoListRequest request);
    RecentRceptListResponse getRecentRceptList(RecentRceptListRequest request);
    RecentPasageListResponse getRecentPasageList(RecentPasageListRequest request);
    JsictionComiteProcessListResponse getJsictionComiteProcessList(JsictionComiteProcessListRequest request);
    RecentMoorListResponse getRecentMoorList(RecentMoorListRequest request);
    SessionRequestResponse getSessionRequestList(SessionRequestListRequest request);
    BillReceiptInfoResponse getBillReceiptInfo(BillReceiptInfoRequest request);
    BillPetitionMemberListResponse getBillPetitionMemberList(BillPetitionMemberListRequest request);
}
