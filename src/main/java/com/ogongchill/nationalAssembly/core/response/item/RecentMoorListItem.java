package com.ogongchill.nationalAssembly.core.response.item;

import lombok.Data;

@Data
public class RecentMoorListItem {
    /**
     * 의안 ID
     */
    private String billId;

    /**
     * 의안번호
     */
    private String billNo;

    /**
     * 의안명
     */
    private String billName;

    /**
     * 제안자
     */
    private String proposer;

    /**
     * 제안자구분
     */
    private String proposerKind;

    /**
     * 제안일
     */
    private String proposeDt;

    /**
     * 회부일
     */
    private String submitDt;

    /**
     * 소관위원회
     */
    private String committeeName;
}
