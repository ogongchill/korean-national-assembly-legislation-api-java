package com.ogongchill.nationalAssembly.core.response.common;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class BillReceiptInfoHeader extends Header {
    @JacksonXmlProperty(localName = "successYN")
    private String successYN;

    @JacksonXmlProperty(localName = "requestMsgID")
    private String requestMsgID;

    @JacksonXmlProperty(localName = "responseMsgID")
    private String responseMsgID;

    @JacksonXmlProperty(localName = "responseTime")
    private String responseTime;
}
