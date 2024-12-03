package com.gzcxadfzc.nationalAssembly.response.item;

import lombok.Data;

@Data
public class BillInfoListItem {
    /**
     * 의안ID
     */
    private String billId;

    /**
     * 의안번호
     */
    private String billNo;

    /**
     * 처리구분
     */
    private String passGubn;

    /**
     * 의안명
     */
    private String billName;

    /**
     * 제안자구분
     */
    private String proposerKind;

    /**
     * 제안일자
     */
    private String proposeDt;

    /**
     * 의결일자
     */
    private String procDt;

    /**
     * 주요내용
     */
    private String summary;

    /**
     * 심사진행상태
     */
    private String procStageCd;
}
