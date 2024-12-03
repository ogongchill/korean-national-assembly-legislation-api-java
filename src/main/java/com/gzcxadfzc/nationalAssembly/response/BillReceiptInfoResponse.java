package com.gzcxadfzc.nationalAssembly.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.gzcxadfzc.nationalAssembly.response.common.BillReceiptInfoHeader;
import com.gzcxadfzc.nationalAssembly.response.common.SingleItemBody;
import com.gzcxadfzc.nationalAssembly.response.item.billReceipt.BillReceiptInfoItem;
import lombok.Data;

@Data
public class BillReceiptInfoResponse {
    @JacksonXmlProperty(localName = "header")
    private BillReceiptInfoHeader header;

    @JacksonXmlProperty(localName = "body")
    private SingleItemBody<BillReceiptInfoItem> body;
}
