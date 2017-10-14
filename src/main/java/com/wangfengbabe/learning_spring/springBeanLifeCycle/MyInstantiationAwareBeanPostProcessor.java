package com.wangfengbabe.learning_spring.springBeanLifeCycle;

import java.beans.PropertyDescriptor;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

/**
 * Created by wangfeng on 18/06/2017.
 */
public class MyInstantiationAwareBeanPostProcessor
    extends InstantiationAwareBeanPostProcessorAdapter {

  public MyInstantiationAwareBeanPostProcessor() {
    // super();
    // System.out.println("This is constructor of concrete
    // InstantiationAwareBeanPostProcessorAdapter");
  }

  public Object postProcessBeforeInstantiation(Class beanClass, String beanName) {
    // System.out.println("postProcessBeforeInstantiation method is
    // called in
    // InstantiationAwareBeanPostProcessor");
    return null;
  }

  public Object postProcessAfterInitialization(Object bean, String beanName) {
    // System.out.println("postProcessAfterInstantiation method is called in
    // InstantiationAwareBeanPostProcessor");
    return bean;
  }

  public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds,
      Object bean, String beanName) throws BeansException {
    // System.out.println("postProcessPropertyValues is called");
    return pvs;
  }

}
