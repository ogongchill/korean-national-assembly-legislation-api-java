package com.ogongchill.nationalAssembly.core.api.exception;

public class UnexpectedResponseException extends NationalAssemblyLegislationApiException {

    private final String actual;
    private final String expected;

    public UnexpectedResponseException(Throwable cause, String actual, String expected) {
        super(cause);
        this.actual = actual;
        this.expected = expected;
    }

    public String getActual() {
        return actual;
    }

    public String getExpected() {
        return expected;
    }
}
