package edu.epam.zavadskaya.exception;

public class FailedSearchException extends Exception{
    public FailedSearchException () {}

    public FailedSearchException (Exception e) {
        super(e);
    }

    public FailedSearchException (String message, Exception e) {
        super(message, e);
    }

    public FailedSearchException (String message) {
        super(message);
    }
}
