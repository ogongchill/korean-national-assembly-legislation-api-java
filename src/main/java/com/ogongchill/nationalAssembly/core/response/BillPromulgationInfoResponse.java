package com.ogongchill.nationalAssembly.core.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.ogongchill.nationalAssembly.core.response.common.DetailHeader;
import com.ogongchill.nationalAssembly.core.response.common.ItemListPagingBody;
import com.ogongchill.nationalAssembly.core.response.item.BillPromulgationInfoItem;

public class BillPromulgationInfoResponse {

	@JacksonXmlProperty(localName = "header")
	private DetailHeader header;

	@JacksonXmlProperty(localName = "body")
	private ItemListPagingBody<BillPromulgationInfoItem> body;

	public DetailHeader getHeader() {
		return header;
	}

	public ItemListPagingBody<BillPromulgationInfoItem> getBody() {
		return body;
	}

	@Override
	public String toString() {
		String linedSeparator = System.lineSeparator();
		StringBuilder builder = new StringBuilder();
		builder.append("header.code: ").append(header.getCode()).append(linedSeparator)
			.append("header.message: ").append(header.getMessage()).append(linedSeparator)
			.append("header.requestMsgId: ").append(header.getRequestMsgID()).append(linedSeparator)
			.append("header.responseMsgId: ").append(header.getResponseMsgID()).append(linedSeparator)
			.append("header.responseTime: ").append(header.getResponseTime()).append(linedSeparator)
			.append("header.successYN: ").append(header.getSuccessYN()).append(linedSeparator);
		if (body != null) {
			builder.append("body.pageNo: ").append(body.getPageNo()).append(linedSeparator)
				.append("body.numOfRows: ").append(body.getNumOfRows()).append(linedSeparator)
				.append("body.totalCount: ").append(body.getTotalCount()).append(linedSeparator);
			for (BillPromulgationInfoItem item : body.getItems()) {
				builder.append(item).append(linedSeparator);
			}
		}
		return builder.toString();
	}
}
