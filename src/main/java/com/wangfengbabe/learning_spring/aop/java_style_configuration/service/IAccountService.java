package com.wangfengbabe.learning_spring.aop.java_style_configuration.service;

import com.wangfengbabe.learning_spring.aop.java_style_configuration.model.Account;

/**
 * Created by wangfeng on 27/06/2017.
 */
public interface IAccountService {

  public void transfer(Account from, Account to, double amount);

}
