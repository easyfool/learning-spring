package com.wangfengbabe.learning_spring;

/**
 * Created by wangfeng on 20/02/2017.
 */
public class HelloWorld {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void printMessage() {
        System.out.println(message);
    }
}
