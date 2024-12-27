package com.ogongchill.nationalAssembly.core.response.item.billAdditionalInfo;

public record ExhaustItem(
        String billLink, // 대안반영폐기 링크 경로
        String billName // 대안반영폐기 의안명
) {
}
