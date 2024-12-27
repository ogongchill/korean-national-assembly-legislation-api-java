package com.ogongchill.nationalAssembly.core.api.util;


import com.ogongchill.nationalAssembly.core.api.exception.ApiErrorException;
import com.ogongchill.nationalAssembly.core.api.exception.UnexpectedResponseException;
import com.ogongchill.nationalAssembly.core.response.BillInfoListResponse;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ogongchill.nationalAssembly.TestUtils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class XmlParserTest {

    @DisplayName("에러 응답시 ApiErrorException 을 반환하는지 확인")
    @ParameterizedTest
    @MethodSource("generateErrorData")
    void testThrowApiErrorException(String fileName, String expectMessage, int expectCode) {
        String sourceFile = TestUtils.readSourceFile(fileName);

        ApiErrorException exception = Assert.assertThrows(ApiErrorException.class, () -> XmlParser.parse(sourceFile, Object.class));
        Assertions.assertEquals(expectMessage, exception.getMessage());
        Assertions.assertEquals(expectCode, exception.getErrorCode());
    }

    private static Stream<Arguments> generateErrorData() {
        return Stream.of(
                Arguments.of("fixtures/errors/EmptyResponse.xml", "response with emptyBody", -1),
                Arguments.of("fixtures/errors/ErrorResponse.xml", "SERVICE_KEY_IS_NOT_REGISTERED_ERROR", 30),
                Arguments.of("fixtures/errors/WrongInputErrorResponse.xml", "입력 값이 잘못되었습니다.", 99)
        );
    }

    @DisplayName("xml과 response객체가 일치하지 않으면 UnexpectedResponseException을 던지는지 확인")
    @Test
    void testThrowUnexpectedResponseException() {
        String sourceFile = TestUtils.readSourceFile("fixtures/BillPetitionMemberListResponse.xml");

        UnexpectedResponseException exception = Assert.assertThrows(UnexpectedResponseException.class,
                () -> XmlParser.parse(sourceFile, BillInfoListResponse.class));
        Assertions.assertEquals(sourceFile, exception.getActual());
        Assertions.assertEquals(BillInfoListResponse.class, exception.getExpectedClass());
    }
}