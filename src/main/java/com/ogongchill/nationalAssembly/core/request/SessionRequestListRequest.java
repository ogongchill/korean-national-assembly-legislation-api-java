package com.ogongchill.nationalAssembly.core.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ogongchill.nationalAssembly.core.api.Operation;
import com.ogongchill.nationalAssembly.core.response.SessionRequestListResponse;
import com.ogongchill.nationalAssembly.core.response.item.SessionRequestListItem;
import com.ogongchill.nationalAssembly.service.code.BillCode;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>의 <code>getSessionRequestList</code>요청 파라미터임
 * @see Operation
 * @see SessionRequestListResponse
 * @see SessionRequestListItem
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SessionRequestListRequest {

    private Integer numOfRows;
    private Integer pageNo;
    @JsonProperty(value = "start_age_cd")
    private Integer startAgeCode;
    @JsonProperty(value = "bill_kind_cd")
    private String billKindCode;
    @JsonProperty(value = "curr_committee")
    private String currCommittee;
    @JsonProperty(value = "bill_name")
    private String billName;

    private SessionRequestListRequest(Builder builder) {
        this.numOfRows = builder.numOfRows;
        this.pageNo = builder.pageNo;
        this.startAgeCode = builder.startAgeCode;
        this.billKindCode = builder.billKindCode;
        this.currCommittee = builder.currCommittee;
        this.billName = builder.billName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer numOfRows;
        private Integer pageNo;
        private Integer startAgeCode;
        private String billKindCode;
        private String currCommittee;
        private String billName;

        public Builder numOfRows(Integer numOfRows) {
            this.numOfRows = numOfRows;
            return this;
        }

        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        public Builder startAgeCd(Integer startAgeCd) {
            this.startAgeCode = startAgeCd;
            return this;
        }

        public Builder billKindCd(BillCode billCode) {
            this.billKindCode = billCode.name();
            return this;
        }

        public Builder currCommittee(String currCommittee) {
            this.currCommittee = currCommittee;
            return this;
        }

        public Builder billName(String billName) {
            this.billName = billName;
            return this;
        }

        public SessionRequestListRequest build() {
            return new SessionRequestListRequest(this);
        }
    }

    public Integer getNumOfRows() {
        return numOfRows;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public Integer getStartAgeCode() {
        return startAgeCode;
    }

    public String getBillKindCode() {
        return billKindCode;
    }

    public String getCurrCommittee() {
        return currCommittee;
    }

    public String getBillName() {
        return billName;
    }
}
