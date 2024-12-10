package com.ogongchill.nationalAssembly.core.response.item;

public record RecentMoorListItem(
    String billId, // 의안 ID
    String billNo, // 의안번호
    String billName, // 의안명
    String proposer, // 제안자
    String proposerKind, // 제안자구분
    String proposeDt, // 제안일
    String submitDt, // 회부일
    String committeeName // 소관위원회
) {
}
