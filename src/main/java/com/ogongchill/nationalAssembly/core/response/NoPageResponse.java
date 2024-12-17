package com.ogongchill.nationalAssembly.core.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.ogongchill.nationalAssembly.core.response.common.Header;
import com.ogongchill.nationalAssembly.core.response.common.ItemListBody;

public class NoPageResponse<T> {

    @JacksonXmlProperty(localName = "header")
    protected Header header;

    @JacksonXmlProperty(localName = "body")
    protected ItemListBody<T> body;

    public Header getHeader() {
        return header;
    }

    public ItemListBody<T> getBody() {
        return body;
    }
}
