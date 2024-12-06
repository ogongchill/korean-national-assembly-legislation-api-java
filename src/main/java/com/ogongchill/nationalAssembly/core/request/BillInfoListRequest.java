package com.ogongchill.nationalAssembly.core.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ogongchill.nationalAssembly.core.api.Operation;
import com.ogongchill.nationalAssembly.core.response.BillInfoListResponse;
import com.ogongchill.nationalAssembly.core.response.item.BillInfoListItem;
import lombok.Builder;
import lombok.Data;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>의 <code>getBillInfoList</code>오퍼레이션의 요청 파라미터임
 * @see Operation
 * @see BillInfoListResponse
 * @see BillInfoListItem
 */

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillInfoListRequest {
    /**
     * 한 페이지 결과 수
     */
    private Integer numOfRows;

    /**
     * 페이지 번호
     */
    private Integer pageNo;

    /**
     * <p>발의자 검색 구분</p>
     * 대표발의 <code>G01</code><br>
     * 1인발의 <code>G02</code><br>
     * 공동발의 <code>G03</code><br>
     */
    private String mem_name_check;

    /**
     * 발의자
     */
    private String mem_name;

    /**
     * 발의자 한자
     * 발의자 한자(동명이인 구분)는 국회의원 현황조회 API의 hjNm참조
     */
    private String hj_name;

    /**
     * <p>제안대수</p>
     * 22대 국회의원이 제안안 의안을 조회하려면 <code>22</code>
     */
    private Integer ord;

    /**
     * 시작 대수
     */
    private Integer start_ord;

    /**
     * <p>마지막 대수</p>
     * 18대 ~ 22대 국회에서 제안된 의안목록 조회시<br>
     * <code>start_ord = 18</code>, <code>end_ord = 22</code>
     */
    private Integer end_ord;

    /**
     * <p>본회의 처리 회기 구분</p>
     * <p>
 *     1. 본회의처리회기 <code>process_num</code><br>
     * 시작처리회기 <code>start_process_num</code><br>
     * 마지막처리회기 <code>end_process_num</code>
     * </p>
     * <p>
     * 2. 제안회기 <code>propose_num</code><br>
     * 시작제안회기 <code>start_propose_num</code><br>
     * 마지막제안회기 <code>end_propose_num</code>
     * </p>
     * 각 파라미터들 중복 사용 불가
     */
    private Integer process_num;

    /**
     * <p>시작본회의처리회기</p>
     * 회기정보API에서 sessionCd참조
     */
    private Integer start_process_num;

    /**
     * <p>마지막본회의처리회기</p>
     * 회기정보API에서 sessionCd참조
     */
    private Integer end_process_num;

    /**
     * 제안회기구분
     */
    private Integer propose_num;

    /**
     * <p>시작제안회기</p>
     * 회기정보API에서 sessionCd참조
     */
    private Integer start_propose_num;

    /**
     * 마지막제안회기
     */
    private Integer end_propose_num;

    /**
     * 시작제안일자
     */
    private String start_propose_date;

    /**
     * 마지막제안일자
     */
    private String end_propose_date;

    /**
     * 시작회부일자
     */
    private String start_committee_dt;

    /**
     * 마지막회부일자
     */
    private String end_committee_dt;

    /**
     * <p>의안종류</p>
     * <code>B01</code> 헌법개정<code>B02</code> 예산안<br>
     * <code>B03</code> 결산<code>B04</code> 법률안<br>
     * <code>B05</code> 동의안<code>B06</code> 승인안<br>
     * <code>B07</code> 결의안<code>B08</code> 건의안<br>
     * <code>B09</code> 규칙안<code>B10</code> 선출안<br>
     * <code>B11</code> 중요동의 <code>B12</code> 의원징계<br>
     * <code>B13</code> 의원자격심사 <code>B14</code> 윤리심사<br>
     * <code>B15</code> 기타안<code>B16</code> 기타<br>
     */
    private String bill_kind_cd;

    /**
     * <p>소관위원회</p>
     * 소관위원회code는 소관위원회 정보 조회API에서
     * <code>gbn=C06</code> 검색 후 <code>committeeCode</code>참조
     */
    private String curr_committee;

    /**
     * <p>제안종류</p>
     * <code>F01</code> 의원<br>
     * <code>F02</code> 위원장<br>
     * <code>F03</code> 정부<br>
     * <code>F04</code> 의장<br>
     * <code>F05</code> 기타<br>
     */
    private String proposerCode;

    /**
     * <p>소관위처리결과</p>
     * <code>D01</code>가결<br>
     * <code>D02</code>부결<br>
     * <code>D03</code>폐기<br>
     * <code>D04</code>계류<br>
     */
    private String p_proc_result_cd;

    /**
     * <p>본회의처리결과</p>
     * <code>E01</code>가결<br>
     * <code>E02</code>부결<br>
     * <code>E03</code>대안반영폐기<br>
     * <code>E04</code>폐기<br>
     * <code>E05</code>임기만료폐기<br>
     * <code>E06</code>철회<br>
     * <code>E07</code>계류<br>
     */
    private String b_proc_result_cd;

    /**
     * 의안명
     */
    private String bill_name;

    /**<p>구분</p>
     * <p>
     * <p>1.제안대수검색</p>
     * 이름 포함 : <code>gbn=dae_num_name</code>
     * <br>
     * 이름 미포함 : <code>gbn=dae_num</code>
     * </p>
     * <p>
     * <p>2.본회의처리회기로 검색</p>
     * 이름 포함: <code>gbn=process_num_name</code>
     * <br>
     * 이름 미포함 : <code>gbn=process_num</code>
     * </p>
     * <p>
     * <p>3.제안회기로 검색</p>
     * 이름 포함 : <code>gbn=propose_num_name</code>
     * <br>
     * 이름 미포함 : <code>gbn=propose_num</code>
     * </p>
     * <br>
     * <br>
     * 각 파라미터들 중복 사용불가
     */
    private String gbn;

    /**
     * <p>본회의수정안 유무</p>
     * <code>true</code>
     * <code>false</code>
     */
    private String amendmentyn;

    /**
     * <p>비용추계서 유무</p>
     * <code>true</code>
     * <code>false</code>
     */
    private String budget; // 비용추계서유무
}
