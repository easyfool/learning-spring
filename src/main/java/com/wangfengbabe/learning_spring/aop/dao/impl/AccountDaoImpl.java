package com.wangfengbabe.learning_spring.aop.dao.impl;

import com.wangfengbabe.learning_spring.aop.dao.IAccountDao;
import com.wangfengbabe.learning_spring.aop.model.Account;

/**
 * Created by wangfeng on 19/06/2017.
 */
public class AccountDaoImpl implements IAccountDao {

  @Override
  public void withdrawMoney(String person, Account account, double amount) {
    System.out.println("AccountDaoImpl : withdraw(String person,Account account,double amount)");
  }

  @Override
  public void depositeMoney(String person, Account account, double amount) {
    System.out.println("AccountDaoImpl : deposite(String person,Account account,double amount)");
    calculate();
  }

  @Override
  public double getBalanceById(int id) {
    System.out.println("AccountDaoImpl : getBalanceById(int id)");
    return 0;
  }

  private void calculate() {
    System.out.println("AccountDaoImpl : private calculate()");
  }
}
