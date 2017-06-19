package com.wangfengbabe.learning_spring.springBeanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by wangfeng on 18/06/2017.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

  public MyBeanPostProcessor() {
    super();
    System.out.println("constructor of concrete BeanPostProccessor ");
  }

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("postProcessBeforeInitialization method is called in BeanPostProccessor");
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("postProcessAfterInitialization method is called in BeanPostProccessor");
    return bean;
  }
}
