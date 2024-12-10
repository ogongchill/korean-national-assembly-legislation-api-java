package com.ogongchill.nationalAssembly.core.response.error;

public class ErrorHeader {

    private String errMsg;
    private String returnAuthMsg;
    private String returnReasonCode;

    public String getErrMsg() {
        return errMsg;
    }

    public String getReturnAuthMsg() {
        return returnAuthMsg;
    }

    public String getReturnReasonCode() {
        return returnReasonCode;
    }
}
