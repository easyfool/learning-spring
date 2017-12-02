package com.wangfengbabe.spring_learning_new;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;


public class Bird implements ApplicationContextAware, BeanNameAware ,ApplicationListener{
  public ApplicationContext applicationContext;


  @Autowired
  private Animal animal;

  public Animal getAnimal() {
    return animal;
  }

  public String beanName;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
  }

  @Override
  public void setBeanName(String s) {
    this.beanName = s;
  }

  @Override
  public void onApplicationEvent(ApplicationEvent applicationEvent) {


  }
}
