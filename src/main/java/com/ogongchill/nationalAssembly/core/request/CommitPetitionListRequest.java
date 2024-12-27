package com.ogongchill.nationalAssembly.core.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ogongchill.nationalAssembly.core.api.Operation;
import com.ogongchill.nationalAssembly.core.response.item.CommitPetitionListItem;
import com.ogongchill.nationalAssembly.core.response.CommitPetitionListResponse;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>의 <code>getCommitPetitionList</code>오퍼레이션의 요청 파라미터임
 * @see Operation
 * @see CommitPetitionListItem
 * @see CommitPetitionListResponse
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommitPetitionListRequest {

    private Integer numOfRows;
    private Integer pageNo;
    private String gbn;
    @JsonProperty("bill_kind_cd")
    private String billKindCd;
    @JsonProperty("start_age_cd")
    private Integer startAgeCd;

    private CommitPetitionListRequest(Builder builder) {
        this.numOfRows = builder.numOfRows;
        this.pageNo = builder.pageNo;
        this.gbn = builder.gbn;
        this.billKindCd = builder.billKindCd;
        this.startAgeCd = builder.startAgeCd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer numOfRows;
        private Integer pageNo;
        private String gbn;
        private String billKindCd;
        private Integer startAgeCd;

        public Builder numOfRows(int numOfRows) {
            this.numOfRows = numOfRows;
            return this;
        }

        public Builder pageNo(int pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        public Builder gbn(String gbn) {
            this.gbn = gbn;
            return this;
        }

        public Builder billKindCd(String billKindCd) {
            this.billKindCd = billKindCd;
            return this;
        }

        public Builder startAgeCd(int startAgeCd) {
            this.startAgeCd = startAgeCd;
            return this;
        }

        public CommitPetitionListRequest build() {
            return new CommitPetitionListRequest(this);
        }
    }
}
