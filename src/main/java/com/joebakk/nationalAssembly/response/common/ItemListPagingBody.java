package com.joebakk.nationalAssembly.response.common;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ItemListPagingBody<T> extends ItemListBody<T> {
    @JacksonXmlProperty(localName = "numOfRows")
    private Integer numOfRows;

    @JacksonXmlProperty(localName = "pageNo")
    private Integer pageNo;

    @JacksonXmlProperty(localName = "totalCount")
    private Integer totalCount;
}