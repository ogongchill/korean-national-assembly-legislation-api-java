package com.ogongchill.nationalAssembly.core.response.item;

public record SessionRequestListItem(
    String billId, // 의안 ID
    String billNo, // 의안번호
    String billName, // 의안명
    String committeeName, // 소관위원회
    String proposer, // 제안자
    String generalResult, // 위원회 의결 결과
    String billHwpLink, // 의안원문: HWP 파일 경로
    String billPdfLink, // 의안원문: PDF 파일 경로
    String judgeHwpLink, // 심사보고서 HWP 파일 경로
    String judgePdfLink, // 심사보고서 PDF 파일 경로
    String reviewHwpLink, // 검토보고서 HWP 파일 경로
    String reviewPdflink // 검토보고서 PDF 파일 경로
) {
}
