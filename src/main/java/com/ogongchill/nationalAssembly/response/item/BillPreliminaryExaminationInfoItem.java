package com.ogongchill.nationalAssembly.response.item;

import lombok.Data;

@Data
public class BillPreliminaryExaminationInfoItem {
    /**
     * 위원회명
     */
    private String comitName;

    /**
     * 회부일
     */
    private String submitDt;

    /**
     * 위원회 상정일
     */
    private String presentDt;

    /**
     * 위원회 의결일
     */
    private String procDt;

    /**
     * 예비심사 검토 보고서 파일명
     */
    private String commentName1;

    /**
     * 예비심사 검토 보고서 HWP 파일 경로
     */
    private String hwpUrl1;

    /**
     * 예비심사 검토 보고서 PDF 파일 경로
     */
    private String pdfUrl1;

    /**
     * 예비심사 보고서 파일명
     */
    private String commentName2;

    /**
     * 예비심사 보고서 HWP파일 경로
     */
    private String hwpUrl2;

    /**
     * 예비심사 보고서 PDF 파일 경로
     */
    private String pdfUrl2;

    /**
     * 회의내역 링크 경로
     */
    private String meetingInfoLink;
}
