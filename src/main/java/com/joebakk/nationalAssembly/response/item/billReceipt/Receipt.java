package com.joebakk.nationalAssembly.response.item.billReceipt;

import lombok.Data;

/**
 * <code>getBillReceiptInfo</code>의 응답은 <code>item</code>내부에 <code>receipt</code>항목으로 파싱되어서 응답됨<br>
 * 응답의 <code>receipt</code>항목을 파싱하기 위한 클래스
 * @see BillReceiptInfoItem
 */
@Data
public class Receipt {
    /**
     * 의안명
     */
    private String billName;

    /**
     * 의안번호
     */
    private String billNo;

    /**
     * 제안일자
     */
    private String proposeDt;

    /**
     * 제안자
     */

    private String proposer;

    /**
     * 문서명 (HWP)
     */
    private String bookHwpName;

    /**
     * 문서명 (PDF)
     */
    private String bookPdfName;

    /**
     * 의안 원문 HWP파일 경로
     */
    private String bookHwpUrl;

    /**
     * 의안 원문 PDF파일 경로
     */
    private String bookPdfUrl;

    /**
     * 기타문서 HWP
     */
    private String etcHwpName;

    /**
     * 기타문서 PDF
     */
    private String etcPdfName;

    /**
     * 기타문서 HWP 파일 경로
     */
    private String etcHwpUrl;

    /**
     * 기타문서 PDF 파일 경로
     */
    private String etcPdfUrl;

    /**
     * 비용추계서 HWP 문서명
     */
    private String cosHwpName;

    /**
     * 비용추계서 PDF 문서명
     */
    private String cosPdfpName;

    /**
     * 비용추계서 HWP 파일 경로
     */
    private String costHwpUrl;

    /**
     * 비용추계서 PDF 파일 경로
     */
    private String costPdfUrl;

    /**
     * 비용추계서 문서명
      */
    private String notcostPdfName;

    /**
     * 비용추계서 HWP 파일 경로
     */
    private String notcostHwpUrl;

    /**
     * 비용추계서 PDF 파일 경로
     */
    private String notcostPdfUrl;

    /**
     * 제안 이유 및 주요내용 링크 경로
     */
    private String summaryLink;

    /**
     * 제안회기
     */
    private String proposePeriod;

    /**
     * 철회일자
     */
    private String withdrawDate;
}
