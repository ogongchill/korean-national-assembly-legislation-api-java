package com.ogongchill.nationalAssembly.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.ogongchill.nationalAssembly.response.common.Header;
import com.ogongchill.nationalAssembly.response.common.ItemListPagingBody;
import com.ogongchill.nationalAssembly.response.item.BillInfoListItem;
import lombok.Data;

@Data
public class BillPetitionMemberListResponse {
    @JacksonXmlProperty(localName = "header")
    private Header header;

    @JacksonXmlProperty(localName = "body")
    private ItemListPagingBody<BillInfoListItem> body;
}
