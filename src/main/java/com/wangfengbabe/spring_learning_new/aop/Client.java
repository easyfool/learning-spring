package com.wangfengbabe.spring_learning_new.aop;

import java.math.BigDecimal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
    AccountService accountServie = context.getBean(AccountService.class);
    Account account = new Account(12345, "wangfeng", new BigDecimal("100"));
    accountServie.withDraw(account, new BigDecimal("20"));
    accountServie.print("wangfeng");

  }

}
