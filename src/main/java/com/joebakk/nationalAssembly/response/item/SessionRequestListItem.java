package com.joebakk.nationalAssembly.response.item;

public class SessionRequestListItem {
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
     * 소관위원회
     */
    private String committeeName;

    /**
     * 제안자
     */
    private String proposer;

    /**
     * 위원회 의결 결과
     */
    private String generalResult;

    /**
     * 의안원문:HWP파일 경로
     */
    private String billHwpLink;

    /**
     * 의안원문:PDF파일 경로
     */
    private String billPdfLink;

    /**
     * 심사보고서 HWP파일 경로
     */
    private String judgeHwpLink;

    /**
     * 심사보고서 PDF파일 경로
     */
    private String judgePdfLink;

    /**
     * 검토보고서 HWP파일 경로
     */
    private String reviewHwpLink;

    /**
     * 검토보고서 PDF파일 경로
     */
    private String reviewPdflink;
}
