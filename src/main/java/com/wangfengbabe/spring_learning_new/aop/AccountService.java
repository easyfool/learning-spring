package com.wangfengbabe.spring_learning_new.aop;

import java.math.BigDecimal;

public interface AccountService {

  public void withDraw(Account account, BigDecimal amount);

  public void deposite(Account account, BigDecimal amount);

  public void print(String name);

}
