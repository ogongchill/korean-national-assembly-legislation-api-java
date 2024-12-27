package com.ogongchill.nationalAssembly.core.response.item;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public record CommitPetitionListItem(
        @JacksonXmlProperty(localName = "committeecode") String committeeCode,
        @JacksonXmlProperty(localName = "committeename") String committeeName
) {
}
