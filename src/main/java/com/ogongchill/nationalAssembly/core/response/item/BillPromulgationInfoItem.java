package com.ogongchill.nationalAssembly.core.response.item;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public record BillPromulgationInfoItem(
	@JacksonXmlProperty(localName = "anounceDt") String announceDt, // 공포 일자
	@JacksonXmlProperty(localName = "anounceNo") String announceNo, // 공포 번호
	@JacksonXmlProperty(localName = "lawTitle") String lawTitle, // 공포 법률명
	@JacksonXmlProperty(localName = "lawBonUrl") String lawBonUrl // 공포법률 Link url
) {
}
