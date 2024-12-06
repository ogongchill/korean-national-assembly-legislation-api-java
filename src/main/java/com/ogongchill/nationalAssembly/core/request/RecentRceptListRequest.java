package com.ogongchill.nationalAssembly.core.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ogongchill.nationalAssembly.core.api.Operation;
import com.ogongchill.nationalAssembly.core.response.RecentRceptListResponse;
import com.ogongchill.nationalAssembly.core.response.item.RecentRceptListItem;
import lombok.Builder;
import lombok.Data;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>의 <code>getRecentRceptList</code>요청 파라미터임
 * @see Operation
 * @see RecentRceptListResponse
 * @see RecentRceptListItem
 */
@Data
@Builder
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
}
