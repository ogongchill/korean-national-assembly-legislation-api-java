package com.ogongchill.nationalAssembly.core.api;

import com.ogongchill.nationalAssembly.core.request.*;
import com.ogongchill.nationalAssembly.core.response.*;
import com.ogongchill.nationalAssembly.core.response.billAdditionalInfo.BillAdditionalInfoResponse;
import com.ogongchill.nationalAssembly.core.response.billCommissionExaminationInfo.BillCommissionExaminationInfoResponse;

public interface
NationalAssemblyLegislationApi {
    BillInfoListResponse getBillInfoList(BillInfoListRequest request);
    RecentRceptListResponse getRecentRceptList(RecentRceptListRequest request);
    RecentPasageListResponse getRecentPasageList(RecentPasageListRequest request);
    JsictionComiteProcessListResponse getJsictionComiteProcessList(JsictionComiteProcessListRequest request);
    RecentMoorListResponse getRecentMoorList(RecentMoorListRequest request);
    SessionRequestListResponse getSessionRequestList(SessionRequestListRequest request);
    BillReceiptInfoResponse getBillReceiptInfo(BillReceiptInfoRequest request);
    BillPetitionMemberListResponse getBillPetitionMemberList(BillPetitionMemberListRequest request);
    BillPromulgationInfoResponse getBillPromulgationInfo(BillPromulgationInfoRequest request);
    BillAdditionalInfoResponse getBillAdditionalInfo(BillAdditionalInfoRequest request);
    BillCommissionExaminationInfoResponse getBillCommissionExaminationInfo(BillCommissionExaminationInfoRequest request);
    CommitPetitionListResponse getCommitPetitionList(CommitPetitionListRequest request);
    MotionLawListResponse getMotionLawList(MotionLawListRequest request);
}
