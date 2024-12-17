package com.ogongchill.nationalAssembly.core.api.exception;

import com.ogongchill.nationalAssembly.core.response.error.ErrorResponse;

public class ApiErrorException extends NationalAssemblyLegislationApiException {

    private final ErrorResponse errorResponse;

    public ApiErrorException(ErrorResponse errorResponse) {
        super(errorResponse.getErrorHeader().getErrMsg());
        this.errorResponse = errorResponse;
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }
}
