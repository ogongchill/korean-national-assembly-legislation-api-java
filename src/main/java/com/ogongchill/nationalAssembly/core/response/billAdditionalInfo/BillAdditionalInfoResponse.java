package com.ogongchill.nationalAssembly.core.response.billAdditionalInfo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.ogongchill.nationalAssembly.core.response.common.DetailHeader;

public record BillAdditionalInfoResponse(
        @JacksonXmlProperty(localName = "header") DetailHeader header,
        @JacksonXmlProperty(localName = "body") BillAdditionalInfoBody body
) {
}

