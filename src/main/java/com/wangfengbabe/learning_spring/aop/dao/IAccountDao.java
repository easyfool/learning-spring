package com.wangfengbabe.learning_spring.aop.dao;

import com.wangfengbabe.learning_spring.aop.model.Account;

/**
 * Created by wangfeng on 19/06/2017.
 */
public interface IAccountDao {

  public void withdrawMoney(String person, Account account, double amount);

  public void depositeMoney(String person, Account account, double amount);

  public double getBalanceById(int id);

}
