package com.wangfengbabe.learning_spring.aop.aopTestUtil;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by wangfeng on 22/06/2017.
 */
@Aspect
public class BarAspect {

  @Before("execution(* com.wangfengbabe.learning_spring.aop.aopTestUtil.Bar.perform(..))")
  public void beforeSayHello(JoinPoint joinPoint) {
    System.out.println("aspect before " + joinPoint.getArgs()[0]);
  }

}
