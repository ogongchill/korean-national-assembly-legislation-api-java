package com.ogongchill.nationalAssembly.core.response.common;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class ItemListBody<T> {
    @JacksonXmlProperty(localName = "items")
    private List<T> items;

    public List<T> getItems() {
        return items;
    }
}
