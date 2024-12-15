package com.ogongchill.nationalAssembly.core.response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.ogongchill.nationalAssembly.TestUtils;
import com.ogongchill.nationalAssembly.core.response.error.ErrorResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ResponseTest {

    @DisplayName("응답 형식확인")
    @ParameterizedTest
    @ValueSource(classes = {
            BillInfoListResponse.class,
            BillPetitionMemberListResponse.class,
            BillPromulgationInfoResponse.class,
            BillReceiptInfoResponse.class,
            JsictionComiteProcessListResponse.class,
            RecentMoorListResponse.class,
            RecentPasageListResponse.class,
            RecentRceptListResponse.class,
            SessionRequestListResponse.class,
            ErrorResponse.class
    })
    void testResponse(Class<?> clazz) throws JsonProcessingException {
        XmlMapper mapper = new XmlMapper();
        String sourceFile = TestUtils.readSourceFile("fixtures/" + clazz.getSimpleName() + ".xml");

        Assertions.assertDoesNotThrow(() -> mapper.readValue(sourceFile, clazz));
    }
}
