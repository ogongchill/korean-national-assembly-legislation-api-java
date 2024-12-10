package com.ogongchill.nationalAssembly.core.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ogongchill.nationalAssembly.core.api.Operation;
import com.ogongchill.nationalAssembly.core.response.item.BillInfoListItem;
import com.ogongchill.nationalAssembly.core.response.item.BillPetitionMemberListItem;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>의 <code>getBillPetitionMemberList</code>오퍼레이션의 요청 파라미터임
 * @see Operation
 * @see BillPetitionMemberListItem
 */
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

    private BillPetitionMemberListRequest(Builder builder) {
        this.bill_id = builder.bill_id;
        this.gbn1 = builder.gbn1;
        this.gbn2 = builder.gbn2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String bill_id;
        private String gbn1;
        private String gbn2;

        private Builder() {
        }

        public Builder bill_id(String bill_id) {
            this.bill_id = bill_id;
            return this;
        }

        public Builder gbn1(String gbn1) {
            this.gbn1 = gbn1;
            return this;
        }

        public Builder gbn2(String gbn2) {
            this.gbn2 = gbn2;
            return this;
        }

        public BillPetitionMemberListRequest build() {
            return new BillPetitionMemberListRequest(this);
        }
    }

    public String getBillId() {
        return bill_id;
    }

    public String getGbn1() {
        return gbn1;
    }

    public String getGbn2() {
        return gbn2;
    }
}
