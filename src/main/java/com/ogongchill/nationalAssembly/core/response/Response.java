package com.ogongchill.nationalAssembly.core.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.ogongchill.nationalAssembly.core.response.common.Header;
import com.ogongchill.nationalAssembly.core.response.common.ItemListPagingBody;

public abstract class Response<T> {

	@JacksonXmlProperty(localName = "header")
	protected Header header;

	@JacksonXmlProperty(localName = "body")
	protected ItemListPagingBody<T> body;

	public Header getHeader() {
		return header;
	}

	public ItemListPagingBody<T> getBody() {
		return body;
	}
}
