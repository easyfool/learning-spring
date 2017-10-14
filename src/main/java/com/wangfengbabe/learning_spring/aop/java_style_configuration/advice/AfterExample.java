package com.wangfengbabe.learning_spring.aop.java_style_configuration.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 28/06/2017.
 */
@Component
@Aspect
public class AfterExample {

  private static final Logger LOGGER = LoggerFactory
      .getLogger(AfterExample.class);

  @After("this(com.wangfengbabe.learning_spring.aop"
      + ".java_style_configuration.service.IPerform)")
  public void afterAnyway(JoinPoint joinPoint) {
    LOGGER.info("no matter success or not ,will leave after performance");
  }
}
