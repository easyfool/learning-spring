package com.wangfengbabe.learning_spring.aop.java_style_configuration.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 27/06/2017.
 */
@Component
@Aspect
public class SystemArchitecture {

  // TODO how to pointcut protected and private method
  @Pointcut("execution(public * *(..))")
  public void anyPublicOperation() {}

  // the execution of any method with a name beginning with "set":
  @Pointcut(value = "execution(* set*(..))")
  public void anyStartWithSetMethod() {

  }

  // the execution of any method defined by the IAccountService interface:
  @Pointcut("execution(* com.wangfengbabe.learning_spring.aop"
      + ".java_style_configuration.service.IAccountService.*(..))")
  public void anyOperationInAccountService() {

  }

  // the execution of any method defined in the service package:
  @Pointcut("execution(* com.wangfengbabe.learning_spring.aop"
      + ".java_style_configuration.service.*.*(..))")
  public void anyOperationDefinedInServicePackage() {

  }

  // the execution of any method defined in the service package or a
  // sub-package:
  @Pointcut("execution(* com.wangfengbabe.learning_spring.aop"
      + ".java_style_configuration.service..*.*(..))")
  public void anyOperationDefinedInserviceOrSubPackage() {

  }

  @Pointcut("within(com.wangfengbabe.learning_spring.aop" + ".java_style_configuration.service.*)")
  public void anyOperationWithServicePackage() {

  }
}
