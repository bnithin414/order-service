package com.aws.CI_CD;

public class OrderNotification {

    private String message;

    public OrderNotification() {
    }

    public OrderNotification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
