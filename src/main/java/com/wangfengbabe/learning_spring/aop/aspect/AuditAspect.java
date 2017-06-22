package com.wangfengbabe.learning_spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by wangfeng on 19/06/2017.
 */
@Aspect
public class AuditAspect {

//  @Before("com.wangfengbabe.learning_spring.aop.pointcut.PointcutCollection.anyPublicOperation()")
//  public void LogForPublicOperation() {
//    System.out.println("logger for public operation");
//  }

  @Before("com.wangfengbabe.learning_spring.aop.pointcut.PointcutCollection.anyPrivateOperation()")
  public void LogForPrivateOperation() {
    System.out.println("logger for private operation");
  }

}
