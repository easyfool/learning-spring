package com.wangfengbabe.learning_spring.aop.java_style_configuration.pointcut.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * Created by wangfeng on 28/06/2017.
 */

public class SimpleAdvice implements MethodInterceptor {


  @Override
  public Object invoke(MethodInvocation methodInvocation) throws Throwable {
    System.out.println("before");
    Object retVal = methodInvocation.proceed();
    System.out.println("after");
    return retVal;
  }
}
