package com.wangfengbabe.learning_spring.aop.java_style_configuration.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 28/06/2017.
 */
@Component @Aspect public class AfterThrowingExample {

    private static final Logger LOGGER =
        LoggerFactory.getLogger(AfterThrowingExample.class);

    @AfterThrowing("this(com.wangfengbabe.learning_spring.aop"
        + ".java_style_configuration.service.IPerform)")
    public void applauseAfterPerformance(JoinPoint joinPoint) {
        LOGGER.info("ask for money back");
        LOGGER.info(joinPoint.getSignature().getName());
    }

}
