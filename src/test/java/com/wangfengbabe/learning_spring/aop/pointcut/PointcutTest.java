package com.wangfengbabe.learning_spring.aop.pointcut;

import com.wangfengbabe.learning_spring.aop.model.Account;
import com.wangfengbabe.learning_spring.aop.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangfeng on 20/06/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-aop.xml")
public class PointcutTest {

  @Autowired
  private Account account;
  @Autowired
  IAccountService accountService;

  @Test
  public void testAnyPublicOperationPointcut() {
    // public method here will be in aop pointcut as well
    accountService.deposite("", new Account(), 10);
  }

  @Test
  public void testAnyPrivateOperationPointcut() {
    //deposite method will call a private calculate method
    accountService.deposite("", new Account(), 10);
  }

}