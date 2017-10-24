package com.wangfengbabe.learning_spring.transaction.service.impl;

import com.wangfengbabe.learning_spring.transaction.service.IAccountService;
import com.wangfengbabe.learning_spring.transaction.service.IOrderService;
import com.wangfengbabe.learning_spring.transaction.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class OrderServiceImpl implements IOrderService {

  @Autowired
  IAccountService accountService;

  @Autowired
  IPersonService personService;

  @Override
  @Transactional
  public void placeOrder() {
    personService.login();
    accountService.pay();

  }
}
