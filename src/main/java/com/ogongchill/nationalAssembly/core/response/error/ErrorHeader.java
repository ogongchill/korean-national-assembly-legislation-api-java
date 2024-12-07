package com.ogongchill.nationalAssembly.core.response.error;

import lombok.Data;

@Data
public class ErrorHeader {
    private String errMsg;
    private String returnAuthMsg;
    private String returnReasonCode;
}
