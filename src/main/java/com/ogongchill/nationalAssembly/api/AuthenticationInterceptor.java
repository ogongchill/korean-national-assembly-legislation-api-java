package com.ogongchill.nationalAssembly.api;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class AuthenticationInterceptor implements Interceptor {
    private final String serviceKey;

    public AuthenticationInterceptor(String serviceKey) {
        this.serviceKey = serviceKey;
    }

    @NotNull
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        HttpUrl originalUrl = originalRequest.url();
        HttpUrl newUrl = originalUrl.newBuilder()
                .addQueryParameter("ServiceKey", serviceKey)
                .build();
        Request newRequest = originalRequest.newBuilder()
                .url(newUrl)
                .build();
        return chain.proceed(newRequest);
    }
}
