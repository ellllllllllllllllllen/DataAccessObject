package edu.epam.zavadskaya.exception;

public class FailedToAddBookException extends Exception{
    public FailedToAddBookException() {}

    public FailedToAddBookException(Exception e) {
        super(e);
    }

    public FailedToAddBookException(String message, Exception e) {
        super(message, e);
    }

    public FailedToAddBookException(String message) {
        super(message);
    }
}
