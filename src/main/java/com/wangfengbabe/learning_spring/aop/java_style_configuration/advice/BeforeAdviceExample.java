package com.wangfengbabe.learning_spring.aop.java_style_configuration.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 28/06/2017.
 */
@Component
@Aspect
public class BeforeAdviceExample {

  private static final Logger LOGGER = LoggerFactory.getLogger(BeforeAdviceExample.class);

  @Before("this(com.wangfengbabe.learning_spring.aop"
      + ".java_style_configuration.service.IPerform)")
  public void applauseBeforePerformance(JoinPoint joinPoint) {
    LOGGER.info("applause before performance");
    LOGGER.info(joinPoint.getSignature().getName());
  }
}
