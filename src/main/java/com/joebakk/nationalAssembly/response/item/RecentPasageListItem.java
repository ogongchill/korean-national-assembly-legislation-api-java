package com.joebakk.nationalAssembly.response.item;

import com.joebakk.nationalAssembly.api.Operation;
import com.joebakk.nationalAssembly.request.RecentRceptListRequest;
import lombok.Data;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href> <code>getRecentPasageList</code>에 따른 응답임 <br>
 * @see Operation
 * @see RecentRceptListRequest
 */
@Data
public class RecentPasageListItem {
    /**
     * 의안 ID
     */
    public String billId;

    /**
     * 의안번호
     */
    public String billNo;

    /**
     * 의안명
     */
    public String billName;

    /**
     * 제안자 구분
     */
    public String proposerKind;

    /**
     * 제안일
     */
    public String proposeDt;

    /**
     * 소관위원회명
     */
    public String committeeName;

    /**
     * 본회의 의결일자
     */
    public String procDt;

    /**
     * 본회의 의결 결과
     */
    public String generalResult;
}
