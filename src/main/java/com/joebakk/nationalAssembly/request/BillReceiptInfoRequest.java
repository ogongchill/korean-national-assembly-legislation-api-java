package com.joebakk.nationalAssembly.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.joebakk.nationalAssembly.api.Operation;
import com.joebakk.nationalAssembly.response.BillReceiptInfoResponse;
import com.joebakk.nationalAssembly.response.item.billReceipt.BillReceiptInfoItem;
import lombok.Builder;
import lombok.Data;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>의 <code>getBillReceiptInfoList</code>오퍼레이션의 요청 파라미터임
 * @see Operation
 * @see BillReceiptInfoResponse
 * @see BillReceiptInfoItem
 */
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillReceiptInfoRequest {
    /**
     * <p>의안 ID</p>
     */
    private String bill_id;
}
