package com.ogongchill.nationalAssembly.core.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ogongchill.nationalAssembly.core.api.Operation;
import com.ogongchill.nationalAssembly.core.response.BillInfoListResponse;
import com.ogongchill.nationalAssembly.core.response.item.BillInfoListItem;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>의 <code>getBillAdditionalInfo</code>오퍼레이션의 요청 파라미터임
 * @see Operation
 * @see BillInfoListResponse
 * @see BillInfoListItem
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillAdditionalInfoRequest {

    @JsonProperty(value = "bill_id")
    private String billId;

    public BillAdditionalInfoRequest(String billId) {
        this.billId = billId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String billId;

        public Builder billId(String billId) {
            this.billId = billId;
            return this;
        }

        public BillAdditionalInfoRequest build() {
            return new BillAdditionalInfoRequest(billId);
        }
    }

    public String getBillId() {
        return billId;
    }
}
