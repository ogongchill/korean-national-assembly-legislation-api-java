package com.ogongchill.nationalAssembly.response.item;

import lombok.Data;

@Data
public class RecentRceptListItem {
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
}
