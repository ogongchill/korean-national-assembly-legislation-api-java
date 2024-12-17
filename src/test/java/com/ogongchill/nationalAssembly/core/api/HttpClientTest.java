package com.ogongchill.nationalAssembly.core.api;

import com.ogongchill.nationalAssembly.core.api.exception.NetworkException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;

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

        Assert.assertThrows(NetworkException.class, () -> httpClient.getResponseBodyString(request));
    }
}