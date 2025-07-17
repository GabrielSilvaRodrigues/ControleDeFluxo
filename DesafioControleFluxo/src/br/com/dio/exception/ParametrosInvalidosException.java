package br.com.dio.exception;

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(final String message) {
        super(message);
    }

    public ParametrosInvalidosException(String message, Throwable cause) {
        super(message, cause);
    }
}
