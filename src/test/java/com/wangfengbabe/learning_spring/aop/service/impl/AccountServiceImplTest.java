package com.wangfengbabe.learning_spring.aop.service.impl;

import com.wangfengbabe.learning_spring.aop.model.Account;
import com.wangfengbabe.learning_spring.aop.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangfeng on 19/06/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-aop.xml")
public class AccountServiceImplTest {

  @Autowired
  IAccountService accountService;

  @Autowired
  Account account;

  @Test
  public void testAopAspectConfiguration() {
    accountService.deposite("wangfeng", account, 1000);
  }
}