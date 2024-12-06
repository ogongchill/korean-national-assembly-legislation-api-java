package com.ogongchill.nationalAssembly.response.item;

import lombok.Data;

@Data
public class BillPromulgationInfoItem {
    /**
     * 공포 일자
     */
    private String announceDt;

    /**
     * 공포 번호
     */
    private String announceNo;

    /**
     * 공포 법률명
     */
    private String lawTitle;

    /**
     * 공포법률 Link url
     */
    private String lawBonUrl;
}
