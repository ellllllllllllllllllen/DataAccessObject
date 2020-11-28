package edu.epam.zavadskaya.exception;

public class FailedToRemoveBookException extends Exception{
    public FailedToRemoveBookException() {}

    public FailedToRemoveBookException(Exception e) {
        super(e);
    }

    public FailedToRemoveBookException(String message, Exception e) {
        super(message, e);
    }

    public FailedToRemoveBookException(String message) {
        super(message);
    }
}
