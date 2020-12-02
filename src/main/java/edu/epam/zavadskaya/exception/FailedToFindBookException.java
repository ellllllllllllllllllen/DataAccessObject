package edu.epam.zavadskaya.exception;

public class FailedToFindBookException extends Exception {
    public FailedToFindBookException() {}

    public FailedToFindBookException(Exception e) {
        super(e);
    }

    public FailedToFindBookException(String message, Exception e) {
        super(message, e);
    }

    public FailedToFindBookException(String message) {
        super(message);
    }
}
