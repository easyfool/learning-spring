package com.wangfengbabe.spring_learning_new.aop;

import java.math.BigDecimal;

public class Account {
  private Integer accountId;
  private String owner;
  private BigDecimal balance;


  public void withdraw(BigDecimal amount) {
    this.balance = this.balance.subtract(amount);
  }

  public void deposite(BigDecimal amount) {
    this.balance = this.balance.add(amount);

  }

  public Account(Integer accountId, String owner, BigDecimal balance) {
    this.accountId = accountId;
    this.owner = owner;
    this.balance = balance;
  }

  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }
}
