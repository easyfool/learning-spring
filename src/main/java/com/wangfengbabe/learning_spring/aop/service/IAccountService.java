package com.wangfengbabe.learning_spring.aop.service;

import com.wangfengbabe.learning_spring.aop.model.Account;

/**
 * Created by wangfeng on 19/06/2017.
 */
public interface IAccountService {

  public void withdraw(String person, Account account, double amount);

  public void deposite(String person, Account account, double amount);

  public double getBalanceById(int id);
}
