package com.ogongchill.nationalAssembly.core.response.billCommissionExaminationInfo;


import com.ogongchill.nationalAssembly.core.response.common.DetailHeader;

public record BillCommissionExaminationInfoResponse(
        DetailHeader header,
        BillCommissionExaminationInfoBody body
) {
}