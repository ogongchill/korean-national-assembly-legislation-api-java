package com.ogongchill.nationalAssembly.core.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.ogongchill.nationalAssembly.core.response.common.Header;
import com.ogongchill.nationalAssembly.core.response.common.ItemListPagingBody;
import com.ogongchill.nationalAssembly.core.response.item.BillPromulgationInfoItem;
import lombok.Data;

@Data
public class BillPromulgationInfoResponse {
    @JacksonXmlProperty(localName = "header")
    private Header header;

    @JacksonXmlProperty(localName = "body")
    private ItemListPagingBody<BillPromulgationInfoItem> body;
}
