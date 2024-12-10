package com.ogongchill.nationalAssembly.core.api.exception;

public class NetworkException extends RuntimeException {

    private final int code;

    public NetworkException(int code, String message) {
        super(message);
        this.code = code;
    }
}
