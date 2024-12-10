package com.ogongchill.nationalAssembly.core.response.common;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Header {
    @JacksonXmlProperty(localName = "resultCode")
    private String code;

    @JacksonXmlProperty(localName = "resultMsg")
    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
