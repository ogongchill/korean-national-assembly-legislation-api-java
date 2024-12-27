package com.ogongchill.nationalAssembly.core.response.billAdditionalInfo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.ogongchill.nationalAssembly.core.response.item.billAdditionalInfo.BillGbnCdItem;
import com.ogongchill.nationalAssembly.core.response.item.billAdditionalInfo.CommMemoItem;
import com.ogongchill.nationalAssembly.core.response.item.billAdditionalInfo.ExhaustItem;

import java.util.List;

public record BillAdditionalInfoBody(
        @JacksonXmlProperty(localName = "commMemo") List<CommMemoItem> commMemo,
        @JacksonXmlElementWrapper(localName = "exhaust") List<ExhaustItem> exhaust,
        @JacksonXmlProperty(localName = "billGbnCd") List<BillGbnCdItem> billGbnCdItem,
        @JacksonXmlProperty(localName = "bpmOthers") String bpmOthers // 도대체 무슨 항목인지 모르겠음. 문서에도 안나와있지만 응답되는 항목
) {
}