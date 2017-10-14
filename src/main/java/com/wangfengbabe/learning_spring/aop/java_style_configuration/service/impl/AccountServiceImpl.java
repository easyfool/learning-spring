package com.wangfengbabe.learning_spring.aop.java_style_configuration.service
    .impl;


import com.wangfengbabe.learning_spring.aop.java_style_configuration.model
    .Account;
import com.wangfengbabe.learning_spring.aop.java_style_configuration.service
    .IAccountService;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 27/06/2017.
 */
@Component public class AccountServiceImpl implements IAccountService {

    @Override public void transfer(Account from, Account to, double amount) {

    }

}
