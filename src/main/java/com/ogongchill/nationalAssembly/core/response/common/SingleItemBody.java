package com.ogongchill.nationalAssembly.core.response.common;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SingleItemBody<T> {

    @JacksonXmlProperty(localName = "item")
    private T item;

    public T getItem() {
        return item;
    }
}
