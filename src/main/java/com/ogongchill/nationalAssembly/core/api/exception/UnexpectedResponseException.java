package com.ogongchill.nationalAssembly.core.api.exception;

public class UnexpectedResponseException extends RuntimeException {

    private final String actual;
    private final Class<?> expectedClass;

    public <T> UnexpectedResponseException(Throwable cause, String actual, Class<T> expected) {
        super(cause);
        this.actual = actual;
        this.expectedClass = expected;
    }

    public String getActual() {
        return actual;
    }

    public Class<?> getExpectedClass() {
        return expectedClass;
    }
}
