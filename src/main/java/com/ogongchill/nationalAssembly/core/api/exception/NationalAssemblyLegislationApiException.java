package com.ogongchill.nationalAssembly.core.api.exception;

public class NationalAssemblyLegislationApiException extends RuntimeException {
    public NationalAssemblyLegislationApiException(Throwable cause) {
        super(cause);
    }

    public NationalAssemblyLegislationApiException(String message) {
        super(message);
    }
}
