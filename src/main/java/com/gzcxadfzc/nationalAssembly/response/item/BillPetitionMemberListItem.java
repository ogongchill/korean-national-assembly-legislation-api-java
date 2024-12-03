package com.gzcxadfzc.nationalAssembly.response.item;

import com.gzcxadfzc.nationalAssembly.api.Operation;
import lombok.Data;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href> <code>getBillPetitionMemberList</code>에 따른 응답임 <br>
 * @see com.gzcxadfzc.nationalAssembly.request.BillInfoListRequest
 * @see Operation
 */

@Data
public class BillPetitionMemberListItem {
    /**<p>구분1</p>
     * 의안 : <code>bill</code><br>
     * 청원 : <code>petition</code><br>
     */
    private String gbn1;

    /**
     * <p>구분2</p>
     * 접수 정보 목록<br>
     * 본회의 수정안 목록<br>
     */
    private String gbn2;

    /**
     * <p>제안자/철회자 구분</p>
     * <code>발의자</code>, <code>찬성자</code>, <code>철회자</code>로 응답
     */
    private String gbnCd;

    /**
     * 한자명
     */
    private String hjNm;

    /**
     * 의원명
     */
    private String memName;

    /**
     * 소속정당
     */
    private String polyNm;
}
