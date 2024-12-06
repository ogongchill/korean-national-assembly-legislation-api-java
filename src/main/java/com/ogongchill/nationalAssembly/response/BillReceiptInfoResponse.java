package com.ogongchill.nationalAssembly.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.ogongchill.nationalAssembly.response.common.BillReceiptInfoHeader;
import com.ogongchill.nationalAssembly.response.common.SingleItemBody;
import com.ogongchill.nationalAssembly.response.item.billReceipt.BillReceiptInfoItem;
import lombok.Data;

@Data
public class BillReceiptInfoResponse {
    @JacksonXmlProperty(localName = "header")
    private BillReceiptInfoHeader header;

    @JacksonXmlProperty(localName = "body")
    private SingleItemBody<BillReceiptInfoItem> body;
}
