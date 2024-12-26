package com.ogongchill.nationalAssembly.core.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ogongchill.nationalAssembly.core.api.Operation;
import com.ogongchill.nationalAssembly.core.response.item.MotionLawListItem;
import com.ogongchill.nationalAssembly.core.response.MotionLawListResponse;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>의 <code>getMotionLawList</code>오퍼레이션의 요청 파라미터임
 *
 * @see Operation
 * @see MotionLawListItem
 * @see MotionLawListResponse
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MotionLawListRequest {

    private Integer numOfRows;
    private Integer pageNo;
    private Integer ord;
    @JsonProperty("start_ord")
    private Integer startOrd;
    @JsonProperty("end_ord")
    private Integer endOrd;
    @JsonProperty("bill_name")
    private String billName;
    @JsonProperty("mem_name")
    private String memName;
    @JsonProperty("hj_nm")
    private String hjNm;
    @JsonProperty("mem_name_check")
    private String memNameCheck;

    public MotionLawListRequest(Builder builder) {
        this.numOfRows = builder.numOfRows;
        this.pageNo = builder.pageNo;
        this.ord = builder.ord;
        this.startOrd = builder.startOrd;
        this.endOrd = builder.endOrd;
        this.billName = builder.billName;
        this.memName = builder.memName;
        this.hjNm = builder.hjNm;
        this.memNameCheck = builder.memNameCheck;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Integer numOfRows;
        private Integer pageNo;
        private Integer ord;
        private Integer startOrd;
        private Integer endOrd;
        private String billName;
        private String memName;
        private String hjNm;
        private String memNameCheck;

        public Builder numOfRows(int numOfRows) {
            this.numOfRows = numOfRows;
            return this;
        }

        public Builder pageNo(int pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        public Builder ord(int ord) {
            this.ord = ord;
            return this;
        }

        public Builder startOrd(int startOrd) {
            this.startOrd = startOrd;
            return this;
        }

        public Builder endOrd(int endOrd) {
            this.endOrd = endOrd;
            return this;
        }

        public Builder billName(String billName) {
            this.billName = billName;
            return this;
        }

        public Builder memName(String memName) {
            this.memName = memName;
            return this;
        }

        public Builder hjNm(String hjNm) {
            this.hjNm = hjNm;
            return this;
        }

        public Builder memNameCheck(String memNameCheck) {
            this.memNameCheck = memNameCheck;
            return this;
        }

        public MotionLawListRequest build() {
            return new MotionLawListRequest(this);
        }
    }
}
