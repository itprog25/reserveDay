package com.company;

public class DayIsFrieadyException extends InvalidDayException{

    public DayIsFrieadyException() {
    }

    public DayIsFrieadyException(String message) {
        super(message);
    }

    public DayIsFrieadyException(String message, Throwable cause) {
        super(message, cause);
    }

    public DayIsFrieadyException(Throwable cause) {
        super(cause);
    }

    public DayIsFrieadyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
