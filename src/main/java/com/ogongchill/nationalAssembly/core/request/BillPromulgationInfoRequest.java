package com.ogongchill.nationalAssembly.core.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ogongchill.nationalAssembly.core.api.Operation;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>의 <code>getBillPromulgationInfo</code>오퍼레이션의 요청 파라미터임
 * @see Operation
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillPromulgationInfoRequest {
    /**
     * 의안 ID
     */
    private String bill_id;

    public BillPromulgationInfoRequest(String bill_id) {
        this.bill_id = bill_id;
    }

    public String getBillId() {
        return bill_id;
    }
}
