package com.gzcxadfzc.nationalAssembly.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.gzcxadfzc.nationalAssembly.response.common.Header;
import com.gzcxadfzc.nationalAssembly.response.common.ItemListPagingBody;
import com.gzcxadfzc.nationalAssembly.response.item.SessionRequestListItem;
import lombok.Data;

@Data
public class SessionRequestResponse {
    @JacksonXmlProperty(localName = "header")
    private Header header;

    @JacksonXmlProperty(localName = "body")
    private ItemListPagingBody<SessionRequestListItem> body;
}
