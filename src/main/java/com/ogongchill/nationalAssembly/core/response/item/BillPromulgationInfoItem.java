package com.ogongchill.nationalAssembly.core.response.item;

public record BillPromulgationInfoItem(
    String announceDt, // 공포 일자
    String announceNo, // 공포 번호
    String lawTitle, // 공포 법률명
    String lawBonUrl // 공포법률 Link url
) {
}
