package com.wangfengbabe.learning_spring.springBeanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by wangfeng on 18/06/2017.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        super();
        // System.out.println("BeanPostProccessor:constructor of concrete ");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
        throws BeansException {
        System.out
            .println("BeanPostProccessor:postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
        throws BeansException {
        System.out.println("BeanPostProccessor:postProcessAfterInitialization");
        return bean;
    }
}
