package com.wangfengbabe.learning_spring.springBeanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by wangfeng on 18/06/2017.
 */
public class MyBeanFactotyPostProcessor implements BeanFactoryPostProcessor {

  public MyBeanFactotyPostProcessor() {
//    super();
//    System.out.println("This is constructor of concrete BeanFactoryPostProcessor");
  }

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//    System.out.println("postProcessBeanFactory method is called in concrete  BeanFactoryPostProcessor");
//    BeanDefinition bdf = beanFactory.getBeanDefinition("person");
//    bdf.getPropertyValues().addPropertyValue("phone", "110");
  }
}
