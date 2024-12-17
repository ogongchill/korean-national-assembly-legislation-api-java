package com.ogongchill.nationalAssembly.core.api.exception;

public class InvalidResponseException extends NationalAssemblyLegislationApiException {

    private final int code;

    public InvalidResponseException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
