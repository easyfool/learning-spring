package com.wangfengbabe.learning_spring.aop.java_style_configuration.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 27/06/2017.
 */
@Component public class Account {

    private static final Logger LOGGER = LoggerFactory.getLogger(Account.class);
    private int id;
    private String owner;
    private double balance;

    private void setPassword() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {

    }

    public void deposite(double amount) {

    }

}
