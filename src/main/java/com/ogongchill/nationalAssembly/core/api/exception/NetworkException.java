package com.ogongchill.nationalAssembly.core.api.exception;

public class NetworkException extends NationalAssemblyLegislationApiException {

    public NetworkException(Throwable cause) {
        super(cause);
    }

    public NetworkException(String message) {
        super(message);
    }
}
