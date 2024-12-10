package com.ogongchill.nationalAssembly.core.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ogongchill.nationalAssembly.core.api.Operation;
import com.ogongchill.nationalAssembly.core.response.RecentMoorListResponse;
import com.ogongchill.nationalAssembly.core.response.item.RecentMoorListItem;
import com.ogongchill.nationalAssembly.service.code.BillCode;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>의 <code>getRecentMoorListRequest</code>오퍼레이션의 요청 파라미터임
 * @see Operation
 * @see RecentMoorListResponse
 * @see RecentMoorListItem
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecentMoorListRequest {
    /**
     * 한 페이지 결과 수
     */
    private Integer numOfRows;

    /**
     * 페이지 번호
     */
    private Integer pageNo;

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
     * 의안명
     */
    private String bill_name;

    /**
     * 대수
     */
    private Integer start_age_cd;

    private RecentMoorListRequest(Builder builder) {
        this.numOfRows = builder.numOfRows;
        this.pageNo = builder.pageNo;
        this.bill_kind_cd = builder.bill_kind_cd;
        this.curr_committee = builder.curr_committee;
        this.bill_name = builder.bill_name;
        this.start_age_cd = builder.start_age_cd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer numOfRows;
        private Integer pageNo;
        private String bill_kind_cd;
        private String curr_committee;
        private String bill_name;
        private Integer start_age_cd;

        public Builder numOfRows(Integer numOfRows) {
            this.numOfRows = numOfRows;
            return this;
        }

        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        public Builder billKindCd(BillCode billCode) {
            this.bill_kind_cd = billCode.name();
            return this;
        }

        public Builder currCommittee(String curr_committee) {
            this.curr_committee = curr_committee;
            return this;
        }

        public Builder billName(String bill_name) {
            this.bill_name = bill_name;
            return this;
        }

        public Builder startAgeCd(Integer start_age_cd) {
            this.start_age_cd = start_age_cd;
            return this;
        }

        public RecentMoorListRequest build() {
            return new RecentMoorListRequest(this);
        }
    }

    public Integer getNumOfRows() {
        return numOfRows;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public String getBillKindCd() {
        return bill_kind_cd;
    }

    public String getCurrCommittee() {
        return curr_committee;
    }

    public String getBillName() {
        return bill_name;
    }

    public Integer getStartAgeCd() {
        return start_age_cd;
    }
}
