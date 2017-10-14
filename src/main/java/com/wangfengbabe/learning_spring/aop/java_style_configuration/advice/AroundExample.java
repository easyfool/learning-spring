package com.wangfengbabe.learning_spring.aop.java_style_configuration.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 28/06/2017.
 */
@Component @Aspect public class AroundExample {

    private static final Logger LOGGER =
        LoggerFactory.getLogger(AroundExample.class);

    @Around("this(com.wangfengbabe.learning_spring.aop"
        + ".java_style_configuration.service.IPerform)")
    public void applauseBeforePerformance(ProceedingJoinPoint joinPoint) {
        LOGGER.info("shut off phone");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        LOGGER.info("turn on light");
    }
}
