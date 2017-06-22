package com.wangfengbabe.learning_spring.aop.service.impl;

import com.wangfengbabe.learning_spring.aop.dao.IAccountDao;
import com.wangfengbabe.learning_spring.aop.model.Account;
import com.wangfengbabe.learning_spring.aop.service.IAccountService;

/**
 * Created by wangfeng on 19/06/2017.
 */
public class AccountServiceImpl implements IAccountService {

  public void setAccountDao(IAccountDao accountDao) {
    this.accountDao = accountDao;
  }

  public AccountServiceImpl() {

  }

  private IAccountDao accountDao;

  @Override
  public void withdraw(String person, Account account, double amount) {
    accountDao.withdrawMoney(person, account, amount);
  }

  @Override
  public void deposite(String person, Account account, double amount) {
    accountDao.depositeMoney(person, account, amount);
  }

  @Override
  public double getBalanceById(int id) {
    return accountDao.getBalanceById(id);
  }

}
