package com.ogongchill.nationalAssembly.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ogongchill.nationalAssembly.api.Operation;
import lombok.Builder;
import lombok.Data;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>의 <code>getBillPromulgationInfo</code>오퍼레이션의 요청 파라미터임
 * @see Operation
 */
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillPromulgationInfoRequest {
    /**
     * 의안 ID
     */
    private String bill_id;
}
