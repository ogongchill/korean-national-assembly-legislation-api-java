package com.ogongchill.nationalAssembly.response.common;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Header {
    @JacksonXmlProperty(localName = "resultCode")
    private String code;

    @JacksonXmlProperty(localName = "resultMsg")
    private String message;
}
