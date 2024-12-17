package com.ogongchill.nationalAssembly.core.api;

import com.ogongchill.nationalAssembly.TestUtils;
import com.ogongchill.nationalAssembly.core.api.exception.InvalidResponseException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class HttpClientTest {

    private MockWebServer mockWebServer;
    private OkHttpClient client;

    @BeforeEach
    public void setUp() {
        mockWebServer = new MockWebServer();
        client = new OkHttpClient();
    }

    @AfterEach
    public void tearDown() throws IOException {
        mockWebServer.shutdown();
    }

    @DisplayName("오류응답시 예외처리 확인")
    @ParameterizedTest
    @ValueSource(ints = {400, 500})
    void testThrowNetworkException(int responseCode) {
        mockWebServer.enqueue(new MockResponse()
                .setBody("")
                .setResponseCode(responseCode));
        HttpUrl baseUrl = mockWebServer.url("/");
        Request request = new Request.Builder()
                .url(baseUrl)
                .build();
        HttpClient httpClient = new HttpClient(client);

        Assert.assertThrows(InvalidResponseException.class, () -> httpClient.getResponseBodyString(request));
    }

    @DisplayName("응답코드가 200이면 예외처리 안되는지 확인")
    @ParameterizedTest
    @MethodSource("readErrorResponses")
    void testNotThrowException(String errorResponseBody) {
        mockWebServer.enqueue(new MockResponse()
                .setBody(errorResponseBody)
                .setResponseCode(200));
        HttpUrl baseUrl = mockWebServer.url("/");
        Request request = new Request.Builder()
                .url(baseUrl)
                .build();
        HttpClient httpClient = new HttpClient(client);

        assertDoesNotThrow(() -> httpClient.getResponseBodyString(request));
    }

    private static Stream<Arguments> readErrorResponses() {
        return Stream.of(
                Arguments.of(
                        TestUtils.readSourceFile("fixtures/errors/EmptyResponse.xml"),
                        TestUtils.readSourceFile("fixtures/errors/ErrorResponse.xml"),
                        TestUtils.readSourceFile("fixtures/errors/WrongInputErrorResponse.xml")
        ));
    }
}