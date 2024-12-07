package com.ogongchill.nationalAssembly.core.response.error;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ErrorResponse {
    @JacksonXmlProperty(localName = "cmmMsgHeader")
    private ErrorHeader errorHeader;
}
