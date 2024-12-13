package com.ogongchill.nationalAssembly.core.api.util;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ogongchill.nationalAssembly.TestUtils;
import com.ogongchill.nationalAssembly.core.response.BillPetitionMemberListResponse;

class XmlParserTest {

	private static final String BILL_PETITION_MEMBER_LIST_RESPONSE_XML = "fixtures/BillPetitionMemberListResponse.xml";

	@DisplayName("")
	@Test
	void test() {
		String sourceFile = TestUtils.readSourceFile(BILL_PETITION_MEMBER_LIST_RESPONSE_XML);
		BillPetitionMemberListResponse response = XmlParser.parse(sourceFile, BillPetitionMemberListResponse.class);
		System.out.println(response.toString());
		assertNotNull(response);
	}
}