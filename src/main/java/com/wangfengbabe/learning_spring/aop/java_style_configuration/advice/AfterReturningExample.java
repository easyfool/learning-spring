package com.wangfengbabe.learning_spring.aop.java_style_configuration.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 27/06/2017.
 */
@Component
@Aspect
public class AfterReturningExample {

  private static final Logger LOGGER = LoggerFactory.getLogger(AfterReturningExample.class);

  @AfterReturning("this(com.wangfengbabe.learning_spring.aop.java_style_configuration.service.IPerform)")
  public void afterAnyway() {
    LOGGER.info("applause after performace");
  }

}
