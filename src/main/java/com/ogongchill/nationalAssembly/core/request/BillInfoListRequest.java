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

    private Integer numOfRows;
    private Integer pageNo;
    @JsonProperty(value = "mem_name_check")
    private String memNameCheck;
    @JsonProperty(value = "mem_name")
    private String memName;
    @JsonProperty(value = "hj_name")
    private String hanjaName;
    @JsonProperty(value = "ord")
    private Integer ordinal;
    @JsonProperty(value = "start_ord")
    private Integer startOrdinal;
    @JsonProperty(value = "end_ord")
    private Integer endOrdinal;
    @JsonProperty(value = "process_num")
    private Integer processNum;
    @JsonProperty(value = "start_process_num")
    private Integer startProcessNum;
    @JsonProperty(value = "end_process_num")
    private Integer endProcessNum;
    @JsonProperty(value = "propose_num")
    private Integer proposeNum;
    @JsonProperty(value = "start_propose_num")
    private Integer startProposeNum;
    @JsonProperty(value = "end_propose_num")
    private Integer endProposeNum;
    @JsonProperty(value = "start_propose_date")
    private String startProposeDate;
    @JsonProperty(value = "end_propose_date")
    private String endProposeDate;
    @JsonProperty(value = "start_committee_dt")
    private String startCommitteeDt;
    @JsonProperty(value = "end_committee_dt")
    private String endCommitteeDt;
    @JsonProperty(value = "bill_kind_cd")
    private String billKindCode;
    @JsonProperty(value = "curr_committee")
    private String currentCommittee;
    private String proposerCode;
    @JsonProperty(value = "p_proc_result_cd")
    private String pProcResultCode;
    @JsonProperty(value = "b_proc_result_cd")
    private String bProcResultCode;
    @JsonProperty(value = "bill_name")
    private String billName;
    private String gbn;
    @JsonProperty(value = "amendmentyn")
    private String amendmentYesOrNo;
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
