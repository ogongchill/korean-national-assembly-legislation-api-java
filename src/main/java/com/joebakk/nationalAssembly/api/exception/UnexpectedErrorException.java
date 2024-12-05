package com.joebakk.nationalAssembly.api.exception;

public class UnexpectedErrorException extends RuntimeException {
    public UnexpectedErrorException(Throwable cause) {
        super(cause);
    }

    public UnexpectedErrorException(String message) {
      super(message);
    }
}
