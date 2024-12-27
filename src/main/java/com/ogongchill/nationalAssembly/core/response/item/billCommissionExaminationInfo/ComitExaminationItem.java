package com.ogongchill.nationalAssembly.core.response.item.billCommissionExaminationInfo;

public record ComitExaminationItem(
        String comitName, // 관련위원회
        String submitDt, // 회부일
        String presentDt, // 상정일
        String procDt, // 의견서제시일
        String pdfUrl // 문서
) {
}
