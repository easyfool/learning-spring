package com.wangfengbabe.spring_learning_new.aop;

import java.math.BigDecimal;
import java.text.MessageFormat;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.support.AopUtils;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditAspect {


  // @Pointcut("execution(* *(..)) && args(account,amount)")
  @Pointcut("execution(* com.wangfengbabe.spring_learning_new.aop.AccountService.*(..)) && args(account,amount)")
  public void withdraw(Account account, BigDecimal amount) {}


  @Around("withdraw(account,amount)")
  public void notify(ProceedingJoinPoint joinPoint, Account account, BigDecimal amount) {
    System.out.println(
        MessageFormat.format("will withdraw  from {0}", account.getAccountId().toString()));
    System.out.println("before withdraw ,account has " + account.getBalance());
    System.out.println("amount =" + amount.toString());
    try {
      joinPoint.proceed();
      System.out
          .println(MessageFormat.format("withdrawed from {0}", account.getAccountId().toString()));
      System.out.println("after withdraw ,account has " + account.getBalance());
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }


  }

  @Before("execution(public * *(..)) && args(name)")
  public void printAspect(String name) {
    System.out.println("before" + name);

  }


}
