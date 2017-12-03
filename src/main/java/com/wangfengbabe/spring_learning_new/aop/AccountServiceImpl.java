package com.wangfengbabe.spring_learning_new.aop;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

  private String operator;

  private Account account;

  public AccountServiceImpl() {}

  public AccountServiceImpl(String operator, Account account) {
    this.operator = operator;
    this.account = account;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  @Override
  public void withDraw(Account account, BigDecimal amount) {
    account.withdraw(amount);

  }

  @Override
  public void deposite(Account account, BigDecimal amount) {
    account.deposite(amount);
  }

  @Override
  public void print(String name) {
    System.out.println("hello");
  }
}
