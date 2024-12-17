package com.ogongchill.nationalAssembly.core.api;

import com.ogongchill.nationalAssembly.core.api.exception.InvalidResponseException;
import com.ogongchill.nationalAssembly.core.api.exception.NetworkException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;

public class HttpClient {
    private final OkHttpClient client;

    public HttpClient(OkHttpClient client) {
        this.client = client;
    }

    public String getResponseBodyString(Request request) {
        try (Response response = client.newCall(request).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful() && responseBody != null) {
                return responseBody.string();
            }
            if (!response.isSuccessful()) {
                throw new InvalidResponseException(response.code(), response.message());
            }
            if (response.body() == null) {
                throw new InvalidResponseException(response.code(), "response body is null");
            }
        } catch (IOException e) {
            throw new NetworkException(e);
        }
        throw new IllegalStateException("Unexpected error: Unreachable code reached");
    }
}
