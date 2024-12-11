package com.ogongchill.nationalAssembly.core.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ogongchill.nationalAssembly.core.api.Operation;
import com.ogongchill.nationalAssembly.core.response.BillInfoListResponse;
import com.ogongchill.nationalAssembly.core.response.item.BillInfoListItem;
import com.ogongchill.nationalAssembly.service.code.CommitteeResultCode;
import com.ogongchill.nationalAssembly.service.code.PlenarySessionResultCode;
import com.ogongchill.nationalAssembly.service.code.ProposerCode;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>의 <code>getBillInfoList</code>오퍼레이션의 요청 파라미터임
 * @see Operation
 * @see BillInfoListResponse
 * @see BillInfoListItem
 */
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
    @JsonProperty(value = "mem_name_check")
    private String memNameCheck;

    /**
     * 발의자
     */
    @JsonProperty(value = "mem_name")
    private String memName;

    /**
     * 발의자 한자
     * 발의자 한자(동명이인 구분)는 국회의원 현황조회 API의 hjNm참조
     */
    @JsonProperty(value = "hj_name")
    private String hanjaName;

    /**
     * <p>제안대수</p>
     * 22대 국회의원이 제안안 의안을 조회하려면 <code>22</code>
     */
    @JsonProperty(value = "ord")
    private Integer ordinal;

    /**
     * 시작 대수
     */
    @JsonProperty(value = "start_ord")
    private Integer startOrdinal;

    /**
     * <p>마지막 대수</p>
     * 18대 ~ 22대 국회에서 제안된 의안목록 조회시<br>
     * <code>start_ord = 18</code>; <code>end_ord = 22</code>
     */
    @JsonProperty(value = "end_ord")
    private Integer endOrdinal;

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
    @JsonProperty(value = "process_num")
    private Integer processNum;

    /**
     * <p>시작본회의처리회기</p>
     * 회기정보API에서 sessionCd참조
     */
    @JsonProperty(value = "start_process_num")
    private Integer startProcessNum;

    /**
     * <p>마지막본회의처리회기</p>
     * 회기정보API에서 sessionCd참조
     */
    @JsonProperty(value = "end_process_num")
    private Integer endProcessNum;

    /**
     * 제안회기구분
     */
    @JsonProperty(value = "propose_num")
    private Integer proposeNum;

    /**
     * <p>시작제안회기</p>
     * 회기정보API에서 sessionCd참조
     */
    @JsonProperty(value = "start_propose_num")
    private Integer startProposeNum;

    /**
     * 마지막제안회기
     */
    @JsonProperty(value = "end_propose_num")
    private Integer endProposeNum;

    /**
     * 시작제안일자
     */
    @JsonProperty(value = "start_propose_date")
    private String startProposeDate;

    /**
     * 마지막제안일자
     */
    @JsonProperty(value = "end_propose_date")
    private String endProposeDate;

    /**
     * 시작회부일자
     */
    @JsonProperty(value = "start_committee_dt")
    private String startCommitteeDt;

    /**
     * 마지막회부일자
     */
    @JsonProperty(value = "end_committee_dt")
    private String endCommitteeDt;

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
    @JsonProperty(value = "bill_kind_cd")
    private String billKindCode;

    /**
     * <p>소관위원회</p>
     * 소관위원회code는 소관위원회 정보 조회API에서
     * <code>gbn=C06</code> 검색 후 <code>committeeCode</code>참조
     */
    @JsonProperty(value = "curr_committee")
    private String currentCommittee;

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
    @JsonProperty(value = "p_proc_result_cd")
    private String pProcResultCode;

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
    @JsonProperty(value = "b_proc_result_cd")
    private String bProcResultCode;

    /**
     * 의안명
     */
    @JsonProperty(value = "bill_name")
    private String billName;

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
    @JsonProperty(value = "amendmentyn")
    private String amendmentYesOrNo;

    /**
     * <p>비용추계서 유무</p>
     * <code>true</code>
     * <code>false</code>
     */
    private String budget;

    private BillInfoListRequest(Builder builder) {
        this.numOfRows = builder.numOfRows;
        this.pageNo = builder.pageNo;
        this.memNameCheck = builder.memNameCheck;
        this.memName = builder.memName;
        this.hanjaName = builder.hjName;
        this.ordinal = builder.ordinal;
        this.startOrdinal = builder.startOrdinal;
        this.endOrdinal = builder.endOrdinal;
        this.startProposeNum = builder.startProposeNum;
        this.endProposeNum = builder.endProposeNum;
        this.proposeNum = builder.proposeNum;
        this.startProposeDate = builder.startProposeDate;
        this.endProposeDate = builder.endProposeDate;
        this.startCommitteeDt = builder.startCommitteeDt;
        this.endCommitteeDt = builder.endCommitteeDt;
        this.billKindCode = builder.billKindCd;
        this.currentCommittee = builder.currCommittee;
        this.proposerCode = builder.proposerCode;
        this.pProcResultCode = builder.pProcResultCd;
        this.bProcResultCode = builder.bProcResultCd;
        this.billName = builder.billName;
        this.gbn = builder.gbn;
        this.amendmentYesOrNo = builder.amendmentYesOrNo;
        this.budget = builder.budget;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer numOfRows;
        private Integer pageNo;
        private String memNameCheck;
        private String memName;
        private String hjName;
        private Integer ordinal;
        private Integer startOrdinal;
        private Integer endOrdinal;
        private Integer processNum;
        private Integer startProcessNum;
        private Integer endProcessNum;
        private Integer proposeNum;
        private Integer startProposeNum;
        private Integer endProposeNum;
        private String startProposeDate;
        private String endProposeDate;
        private String startCommitteeDt;
        private String endCommitteeDt;
        private String billKindCd;
        private String currCommittee;
        private String proposerCode;
        private String pProcResultCd;
        private String bProcResultCd;
        private String billName;
        private String gbn;
        private String amendmentYesOrNo;
        private String budget;

        public Builder numOfRows(Integer numOfRows) {
            this.numOfRows = numOfRows;
            return this;
        }

        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        public Builder memNameCheck(String memNameCheck) {
            this.memNameCheck = memNameCheck;
            return this;
        }

        public Builder memName(String memName) {
            this.memName = memName;
            return this;
        }

        public Builder hjName(String hjName) {
            this.hjName = hjName;
            return this;
        }

        public Builder ordinal(Integer ordinal) {
            this.ordinal = ordinal;
            return this;
        }

        public Builder startOrdinal(Integer startOrdinal) {
            this.startOrdinal = startOrdinal;
            return this;
        }

        public Builder endOrdinal(Integer endOrdinal) {
            this.endOrdinal = endOrdinal;
            return this;
        }

        public Builder processNum(Integer processNum) {
            this.processNum = processNum;
            return this;
        }

        public Builder startProcessNum(Integer startProcessNum) {
            this.startProcessNum = startProcessNum;
            return this;
        }

        public Builder endProcessNum(Integer endProcessNum) {
            this.endProcessNum = endProcessNum;
            return this;
        }

        public Builder proposeNum(Integer proposeNum) {
            this.proposeNum = proposeNum;
            return this;
        }

        public Builder startProposeNum(Integer startProposeNum) {
            this.startProposeNum = startProposeNum;
            return this;
        }

        public Builder endProposeNum(Integer endProposeNum) {
            this.endProposeNum = endProposeNum;
            return this;
        }

        public Builder startProposeDate(String startProposeDate) {
            this.startProposeDate = startProposeDate;
            return this;
        }

        public Builder endProposeDate(String endProposeDate) {
            this.endProposeDate = endProposeDate;
            return this;
        }

        public Builder startCommitteeDt(String startCommitteeDt) {
            this.startCommitteeDt = startCommitteeDt;
            return this;
        }

        public Builder endCommitteeDt(String endCommitteeDt) {
            this.endCommitteeDt = endCommitteeDt;
            return this;
        }

        public Builder billKindCd(String billKindCd) {
            this.billKindCd = billKindCd;
            return this;
        }

        public Builder currCommittee(String currCommittee) {
            this.currCommittee = currCommittee;
            return this;
        }

        public Builder proposerCode(ProposerCode proposerCode) {
            this.proposerCode = proposerCode.name();
            return this;
        }

        public Builder pProcResultCd(CommitteeResultCode pProcResultCd) {
            this.pProcResultCd = pProcResultCd.name();
            return this;
        }

        public Builder bProcResultCd(PlenarySessionResultCode bProcResultCd) {
            this.bProcResultCd = bProcResultCd.name();
            return this;
        }

        public Builder billName(String billName) {
            this.billName = billName;
            return this;
        }

        public Builder gbn(String gbn) {
            this.gbn = gbn;
            return this;
        }

        public Builder amendmentYesOrNo(String amendmentyn) {
            this.amendmentYesOrNo = amendmentyn;
            return this;
        }

        public Builder budget(String budget) {
            this.budget = budget;
            return this;
        }

        public BillInfoListRequest build() {
            return new BillInfoListRequest(this);
        }
    }

    public Integer getNumOfRows() {
        return numOfRows;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public String getMemNameCheck() {
        return memNameCheck;
    }

    public String getMemName() {
        return memName;
    }

    public String getHanjaName() {
        return hanjaName;
    }

    public Integer getOrdinal() {
        return ordinal;
    }

    public Integer getStartOrdinal() {
        return startOrdinal;
    }

    public Integer getEndOrdinal() {
        return endOrdinal;
    }

    public Integer getProcessNum() {
        return processNum;
    }

    public Integer getStartProcessNum() {
        return startProcessNum;
    }

    public Integer getEndProcessNum() {
        return endProcessNum;
    }

    public Integer getProposeNum() {
        return proposeNum;
    }

    public Integer getStartProposeNum() {
        return startProposeNum;
    }

    public Integer getEndProposeNum() {
        return endProposeNum;
    }

    public String getStartProposeDate() {
        return startProposeDate;
    }

    public String getEndProposeDate() {
        return endProposeDate;
    }

    public String getStartCommitteeDt() {
        return startCommitteeDt;
    }

    public String getEndCommitteeDt() {
        return endCommitteeDt;
    }

    public String getBillKindCode() {
        return billKindCode;
    }

    public String getCurrCommittee() {
        return currentCommittee;
    }

    public String getProposerCode() {
        return proposerCode;
    }

    public String pProcResultCd() {
        return pProcResultCode;
    }

    public String bProcResultCd() {
        return bProcResultCode;
    }

    public String getBillName() {
        return billName;
    }

    public String getGbn() {
        return gbn;
    }

    public String getAmendmentYesOrNo() {
        return amendmentYesOrNo;
    }

    public String getBudget() {
        return budget;
    }
}
