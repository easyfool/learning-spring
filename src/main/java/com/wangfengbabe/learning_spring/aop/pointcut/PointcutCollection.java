package com.wangfengbabe.learning_spring.aop.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by wangfeng on 19/06/2017.
 */
@Aspect
public class PointcutCollection {

  //the execution of any public method
  @Pointcut("execution(public * *(..))")
  public void anyPublicOperation() {
  }

  //the execution of any public method
  @Pointcut("execution(private * *(..))")
  public void anyPrivateOperation() {
  }

  //the execution of any method with a name beginning with "set":

  @Pointcut("within(com.wangfengbabe.learning_spring.aop.service.impl.*)")
  public void inAccountService() {
  }

  @Pointcut("inAccountService() && anyPublicOperation()")
  public void accountOperation() {

  }

}
