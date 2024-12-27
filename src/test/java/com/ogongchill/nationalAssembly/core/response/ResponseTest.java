package com.ogongchill.nationalAssembly.core.response;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.ogongchill.nationalAssembly.TestUtils;
import com.ogongchill.nationalAssembly.core.response.billAdditionalInfo.BillAdditionalInfoResponse;
import com.ogongchill.nationalAssembly.core.response.billCommissionExaminationInfo.BillCommissionExaminationInfoResponse;
import com.ogongchill.nationalAssembly.core.response.error.ErrorResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ResponseTest {
    private XmlMapper mapper;

    @BeforeEach
    void init() {
        mapper = new XmlMapper();
    }


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
            CommitPetitionListResponse.class,
            BillCommissionExaminationInfoResponse.class,
            MotionLawListResponse.class
    })
    void testResponse(Class<?> clazz) {;
        String sourceFile = TestUtils.readSourceFile("fixtures/" + clazz.getSimpleName() + ".xml");

        Assertions.assertDoesNotThrow(() -> mapper.readValue(sourceFile, clazz));
    }

    @DisplayName("getBillAdditionalInfo 응답 형식 확인")
    @ParameterizedTest
    @ValueSource(strings = {
            "fixtures/BillAdditionalInfoAlternative.xml", // 대안
            "fixtures/BillAdditionalInfoRepeal.xml" // 대안 반영 폐기
    })
    void testGetBillAdditionalInfoResponse(String path) {
        String sourceFile = TestUtils.readSourceFile(path);

        Assertions.assertDoesNotThrow(()->mapper.readValue(sourceFile, BillAdditionalInfoResponse.class));
    }

    @DisplayName("국회입법정보api의 error메시지 응답 형식 확인")
    @Test
    void testErrorResponse() {
        String sourceFile = TestUtils.readSourceFile("fixtures/errors/ErrorResponse.xml");

        Assertions.assertDoesNotThrow(() -> mapper.readValue(sourceFile, ErrorResponse.class));
    }
}
