package com.gzcxadfzc.nationalAssembly.api;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>에 따른 오퍼레이션 명임
 */
public enum Operation {
    getBillInfoList("의안 목록 검색"),
    getRecentRceptList("최근 접수의안 목록 정보조회"),
    getRecentPasageList("최근 통과의안 목록 정보조회"),
    getJsictionComiteProcessList("처리의안 목록 정보 조회"),
    getRecentMoorList("계류의안 목록 정보조회"),
    getSessionRequestList("본회의부의요청안건 목록 정보조회"),
    getBillReceiptInfo("의안 접수 정보조회"),
    getBillPetitionMemberList("의안/청원 접수정보 국회의원 목록조회"),
    getBillPreliminaryExaminationInfo("의안 예비 심사 정보 조회"),
    getBillComprehensiveAuditInfo("의안 종합심사 정보조회"),
    getBillCommissionExaminationInfo("의안 위원회심사 정보조회"),
    getBillDeliverateInfo("의안 본회의심의 정보조회"),
    getBillTransferredInfo("의안 정부이송 정보조회"),
    getBillAdditionalInfo("의안 부가정보조회"),
    getPassRceptRecentList("처리의안 통계(총괄) 정보조회"),
    getRceptKndList("처리의안 통계(의안종류별) 정보조회"),
    getRceptMoorList("처리의안 통계(위원회별) 정보조회"),
    getProcessBillStaticInfoList("처리의안 통계(법률안) 정보조회"),
    getMooringBillStaticList("계류의안 통계"),
    getJudgeReportBodyList("심사보고서 내용 목록 정보조회"),
    getMotionLawList("발의법률안 목록 정보조회"),
    getOfferReasonList("제안이유/주요내용 목록 정보조회"),
    getPeriodList("회기정보 조회"),
    getCommitPetitionList("소관위원회 정보조회"),
    getPetitionList("청원 목록 정보조회"),
    getCommitPetitionProcessInfoList("청원 처리 목록 정보조회"),
    getCommitPetitionMooringInfoList("청원 계류 목록 정보조회"),
    getPetitionReceiptInfo("청원 접수 정보조회"),
    getPetitionCommissionExaminationInfo("청원 위원회심사 정보조회"),
    getPetitionDeliverateInfo("청원 본회의심의 정보조회"),
    getPetitionTransferredInfo("청원 정부이송 정보조회"),
    getAchievementInfo("청원 달성도 정보조회"),
    getPetitionAdditionalInfo("청원 부가 정보조회"),
    getPetitionStatic("청원 통계 정보조회"),
    getAnnualReportList("연차보고서 목록 정보조회"),
    getAnnualReportDetail("연차보고서 세부 정보조회"),
    getBillPromulgationInfo("의안 공포 정보조회");

    private final String korName;

    Operation(String korName) {
        this.korName = korName;
    }
}
