package com.ogongchill.nationalAssembly.core.api;

import okhttp3.HttpUrl;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>에 따른 오퍼레이션 명임
 */
public enum Operation {
    GET_BILL_INFO_LIST("의안 목록 검색"),
    GET_RECENT_RCEPT_LIST("최근 접수의안 목록 정보조회"),
    GET_RECENT_PASAGE_LIST("최근 통과의안 목록 정보조회"),
    GET_JSICTION_COMITE_PROCESS_LIST("처리의안 목록 정보 조회"),
    GET_RECENT_MOOR_LIST("계류의안 목록 정보조회"),
    GET_SESSION_REQUEST_LIST("본회의부의요청안건 목록 정보조회"),
    GET_BILL_RECEIPT_INFO("의안 접수 정보조회"),
    GET_BILL_PETITION_MEMBER_LIST("의안/청원 접수정보 국회의원 목록조회"),
    GET_BILL_PRELIMINARY_EXAMINATION_INFO("의안 예비 심사 정보 조회"),
    GET_BILL_COMPREHENSIVE_AUDIT_INFO("의안 종합심사 정보조회"),
    GET_BILL_COMMISSION_EXAMINATION_INFO("의안 위원회심사 정보조회"),
    GET_BILL_DELIVERATE_INFO("의안 본회의심의 정보조회"),
    GET_BILL_TRANSFERRED_INFO("의안 정부이송 정보조회"),
    GET_BILL_ADDITIONAL_INFO("의안 부가정보조회"),
    GET_PASS_RCEPT_RECENT_LIST("처리의안 통계(총괄) 정보조회"),
    GET_RCEPT_KND_LIST("처리의안 통계(의안종류별) 정보조회"),
    GET_RCEPT_MOOR_LIST("처리의안 통계(위원회별) 정보조회"),
    GET_PROCESS_BILL_STATIC_INFO_LIST("처리의안 통계(법률안) 정보조회"),
    GET_MOORING_BILL_STATIC_LIST("계류의안 통계"),
    GET_JUDGE_REPORT_BODY_LIST("심사보고서 내용 목록 정보조회"),
    GET_MOTION_LAW_LIST("발의법률안 목록 정보조회"),
    GET_OFFER_REASON_LIST("제안이유/주요내용 목록 정보조회"),
    GET_PERIOD_LIST("회기정보 조회"),
    GET_COMMIT_PETITION_LIST("소관위원회 정보조회"),
    GET_PETITION_LIST("청원 목록 정보조회"),
    GET_COMMIT_PETITION_PROCESS_INFO_LIST("청원 처리 목록 정보조회"),
    GET_COMMIT_PETITION_MOORING_INFO_LIST("청원 계류 목록 정보조회"),
    GET_PETITION_RECEIPT_INFO("청원 접수 정보조회"),
    GET_PETITION_COMMISSION_EXAMINATION_INFO("청원 위원회심사 정보조회"),
    GET_PETITION_DELIVERATE_INFO("청원 본회의심의 정보조회"),
    GET_PETITION_TRANSFERRED_INFO("청원 정부이송 정보조회"),
    GET_ACHIEVEMENT_INFO("청원 달성도 정보조회"),
    GET_PETITION_ADDITIONAL_INFO("청원 부가 정보조회"),
    GET_PETITION_STATIC("청원 통계 정보조회"),
    GET_ANNUAL_REPORT_LIST("연차보고서 목록 정보조회"),
    GET_ANNUAL_REPORT_DETAIL("연차보고서 세부 정보조회"),
    GET_BILL_PROMULGATION_INFO("의안 공포 정보조회");

    private static final HttpUrl BASE_URL_BUILDER = new HttpUrl.Builder()
            .scheme("https")
            .host("apis.data.go.kr")
            .addPathSegment("9710000")
            .addPathSegment("BillInfoService2")
            .build();
    private final String korName;

    Operation(String korName) {
        this.korName = korName;
    }

    public HttpUrl.Builder httpUrlBuilder() {
        return BASE_URL_BUILDER.newBuilder()
                .addPathSegment(this.name());
    }
}
