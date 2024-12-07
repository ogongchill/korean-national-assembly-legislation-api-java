package com.ogongchill.nationalAssembly.core.api.exception;

import com.ogongchill.nationalAssembly.core.response.error.ErrorResponse;

public class ApiErrorException extends RuntimeException {
    private ErrorResponse errorResponse;

    public ApiErrorException(ErrorResponse errorResponse) {
        super(errorResponse.getErrorHeader().getErrMsg());
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }
}
