package com.aws.CI_CD;

import java.time.ZonedDateTime;

public class OrderNotification {

    private String message;
    private ZonedDateTime dateTime;

    public OrderNotification() {
    }

    public OrderNotification(String message, ZonedDateTime dateTime) {
        this.message = message;
        this.dateTime = dateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
