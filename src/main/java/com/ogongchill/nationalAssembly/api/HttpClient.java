package com.ogongchill.nationalAssembly.api;

import com.ogongchill.nationalAssembly.api.exception.NetworkException;
import com.ogongchill.nationalAssembly.api.exception.UnexpectedErrorException;
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
                throw new NetworkException(response.code(), response.message());
            }
            if (response.body() == null) {
                throw new NetworkException(response.code(), "response body is null");
            }
        } catch (IOException e) {
            throw new UnexpectedErrorException(e);
        }
        throw new UnexpectedErrorException("Unexpected error: Unreachable code reached");
    }
}
