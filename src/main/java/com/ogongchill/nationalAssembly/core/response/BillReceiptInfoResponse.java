package com.ogongchill.nationalAssembly.core.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.ogongchill.nationalAssembly.core.response.common.DetailHeader;
import com.ogongchill.nationalAssembly.core.response.common.SingleItemBody;
import com.ogongchill.nationalAssembly.core.response.item.billReceipt.BillReceiptInfoItem;

public class BillReceiptInfoResponse {
    @JacksonXmlProperty(localName = "header")
    private DetailHeader header;

    @JacksonXmlProperty(localName = "body")
    private SingleItemBody<BillReceiptInfoItem> body;

    public DetailHeader getHeader() {
        return header;
    }

    public SingleItemBody<BillReceiptInfoItem> getBody() {
        return body;
    }

    @Override
    public String toString() {
        String linedSeparator = System.lineSeparator();
        StringBuilder builder = new StringBuilder();
        builder.append("header.code: ").append(header.getCode()).append(linedSeparator)
            .append("header.message: ").append(header.getMessage()).append(linedSeparator)
            .append("header.requestMsgId: ").append(header.getRequestMsgID()).append(linedSeparator)
            .append("header.responseMsgId: ").append(header.getResponseMsgID()).append(linedSeparator)
            .append("header.responseTime: ").append(header.getResponseTime()).append(linedSeparator)
            .append("header.successYN: ").append(header.getSuccessYN()).append(linedSeparator);
        if (body != null) {
            builder.append("body: ").append(body.getItem().toString()).append("\n");
        }
        return builder.toString();
    }
}
