package com.ogongchill.nationalAssembly.response.common;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

@Data
public class ItemListBody<T> {
    @JacksonXmlProperty(localName = "items")
    private List<T> items;
}
