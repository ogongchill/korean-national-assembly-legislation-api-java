package com.ogongchill.nationalAssembly.core.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ogongchill.nationalAssembly.core.api.Operation;
import com.ogongchill.nationalAssembly.core.response.RecentRceptListResponse;
import com.ogongchill.nationalAssembly.core.response.item.RecentRceptListItem;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>의 <code>getRecentRceptList</code>요청 파라미터임
 * @see Operation
 * @see RecentRceptListResponse
 * @see RecentRceptListItem
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecentRceptListRequest {
    /**
     * 한 페이지 결과 수, 기본값은 10
     */
    private Integer numOfRows;

    /**
     * 페이지 번호
     */
    private Integer pageNo;

    /**
     * 의안명
     */
    private String bill_name;

    private RecentRceptListRequest(Builder builder) {
        this.numOfRows = builder.numOfRows;
        this.pageNo = builder.pageNo;
        this.bill_name = builder.bill_name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer numOfRows;
        private Integer pageNo;
        private String bill_name;

        public Builder numOfRows(Integer numOfRows) {
            this.numOfRows = numOfRows;
            return this;
        }

        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        public Builder billName(String bill_name) {
            this.bill_name = bill_name;
            return this;
        }

        public RecentRceptListRequest build() {
            return new RecentRceptListRequest(this);
        }
    }

    public Integer getNumOfRows() {
        return numOfRows;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public String getBill_name() {
        return bill_name;
    }
}
