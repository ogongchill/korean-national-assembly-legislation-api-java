package com.gzcxadfzc.nationalAssembly.api.exception;

import lombok.Getter;

@Getter
public class NetworkException extends RuntimeException {
    private final int code;

    public NetworkException(int code, String message) {
        super(message);
        this.code = code;
    }
}
