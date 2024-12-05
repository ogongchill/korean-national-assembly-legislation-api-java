package com.joebakk.nationalAssembly.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.joebakk.nationalAssembly.response.common.Header;
import com.joebakk.nationalAssembly.response.common.ItemListPagingBody;
import com.joebakk.nationalAssembly.response.item.RecentRceptListItem;
import lombok.Data;

@Data
public class RecentRceptListResponse {
    @JacksonXmlProperty(localName = "header")
    private Header header;

    @JacksonXmlProperty(localName = "body")
    private ItemListPagingBody<RecentRceptListItem> body;
}
