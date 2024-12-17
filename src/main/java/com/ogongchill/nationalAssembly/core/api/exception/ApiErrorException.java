package com.ogongchill.nationalAssembly.core.api.exception;

public class ApiErrorException extends NationalAssemblyLegislationApiException {

    private final int errorCode;

    public ApiErrorException(String errorMessage, int errorCode) {
        super(errorMessage);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
