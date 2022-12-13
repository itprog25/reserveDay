package com.company;

public class DayOutOfBaounds extends InvalidDayException{

    public DayOutOfBaounds() {
    }

    public DayOutOfBaounds(String message) {
        super(message);
    }

    public DayOutOfBaounds(String message, Throwable cause) {
        super(message, cause);
    }

    public DayOutOfBaounds(Throwable cause) {
        super(cause);
    }

    public DayOutOfBaounds(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
