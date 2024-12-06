package com.ogongchill.nationalAssembly.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ogongchill.nationalAssembly.api.Operation;
import com.ogongchill.nationalAssembly.response.item.BillInfoListItem;
import com.ogongchill.nationalAssembly.response.item.BillPetitionMemberListItem;
import lombok.Builder;
import lombok.Data;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>의 <code>getBillPetitionMemberList</code>오퍼레이션의 요청 파라미터임
 * @see Operation
 * @see BillPetitionMemberListItem
 */

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillPetitionMemberListRequest {
    /**
     * 의안 접수 정보의 제안자(목록 조회)는 <code>RecentBillItem</code>, <code>RecentRceptListItem</code>에서 <code>billId</code>참조<br>
     * 본회의 심의의 본회의 수정안 제안인자(목록) 조회는 <code>BillDeliverateInfoItem</code>에서 <code>properserId</code> 참조<br>
     * 청원접수정보의 소개의원(목록)조회는 <code>PetitionListItem</code>, <code>CommitPetitionProcessInfoListItem</code> 등에서 <code>billId</code>참조<br>
     * 각 <code>billId</code>및 <code>proposerId</code>에 맞는 파라미터가 아닐시 상이한 결과 도출됨
     * @see BillInfoListItem
     */
    private String bill_id;

    /**
     * <p>구분자(의안,청원)</p>
     * 의안 : <code>bill</code><br>
     * 청원 : <code>petition</code><br>
     * 각 파라미터 중복 불가
     */
    private String gbn1;

    /**
     * <p>구분자(접수 정보 목록(의안제안자, 철회 요구자), 본회의 수정안 제안자 목록)</p>
     * 접수 정보 제안자/철회요구자 목록 : <code>reception</code><br>
     * 본회의 수정안 제안자 목록: <code>mainconf</code><br>
     * 각 파라미터 중복 불가
     */
    private String gbn2;
}
