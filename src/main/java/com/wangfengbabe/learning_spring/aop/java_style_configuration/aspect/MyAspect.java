package com.wangfengbabe.learning_spring.aop.java_style_configuration.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 27/06/2017.
 */
@Component @Aspect public class MyAspect {

    private static final Logger LOGGER =
        LoggerFactory.getLogger(MyAspect.class);

    @Before("com.wangfengbabe.learning_spring.aop.java_style_configuration"
        + ".pointcut.SystemArchitecture.anyPublicOperation()")
    public void loggerBeforeAnyPublicOperation() {
        LOGGER.info("logger before any public Opration");
    }

    @Before("com.wangfengbabe.learning_spring.aop.java_style_configuration"
        + ".pointcut.SystemArchitecture.anyStartWithSetMethod()")
    public void loggerBeforeAnyOperationStartsWithSet() {
        LOGGER.info("logger before any Opration starts with set");
    }

    @Before("com.wangfengbabe.learning_spring.aop.java_style_configuration"
        + ".pointcut.SystemArchitecture.anyOperationInAccountService()")
    public void loggerBeforeAnyOperationInAccountService() {
        LOGGER.info("logger before any operation for IAccountService");
    }

    @Before("com.wangfengbabe.learning_spring.aop.java_style_configuration"
        + ".pointcut.SystemArchitecture.anyOperationDefinedInServicePackage()")
    public void loggerBeforeAnyOperationInServicePackage() {
        LOGGER.info("logger before any operation in service package");
    }

    @Before("com.wangfengbabe.learning_spring.aop.java_style_configuration"
        + ".pointcut.SystemArchitecture"
        + ".anyOperationDefinedInserviceOrSubPackage()")
    public void loggerBeforeAnyOperationInServiceOrSubPackage() {
        LOGGER.info("logger before any operation in service or sub package");
    }

    @Before("com.wangfengbabe.learning_spring.aop.java_style_configuration"
        + ".pointcut.SystemArchitecture.anyOperationWithServicePackage()")
    public void loggerBeforeAnyOperationWithinServicePackage() {
        LOGGER.info("within package");
    }


}
