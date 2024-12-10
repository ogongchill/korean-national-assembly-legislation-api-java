package com.ogongchill.nationalAssembly.core.response.error;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ErrorResponse {

    @JacksonXmlProperty(localName = "cmmMsgHeader")
    private ErrorHeader errorHeader;

    public ErrorHeader getErrorHeader() {
        return errorHeader;
    }
}
