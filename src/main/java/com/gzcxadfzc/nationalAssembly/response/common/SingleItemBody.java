package com.gzcxadfzc.nationalAssembly.response.common;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class SingleItemBody<T> {
    @JacksonXmlProperty(localName = "item")
    private T item;
}
