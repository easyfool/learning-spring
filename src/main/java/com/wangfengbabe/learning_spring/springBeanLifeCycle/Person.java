package com.wangfengbabe.learning_spring.springBeanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by wangfeng on 18/06/2017.
 */
public class Person implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean,
    DisposableBean {

  private String name;
  private String address;
  private int phone;
  private BeanFactory beanFactory;

  private String beanName;

  public Person() {
    System.out.println("Person default constructor is called");
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", phone=" + phone +
        ", beanFactory=" + beanFactory +
        ", beanName='" + beanName + '\'' +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    System.out.println("setter: [name]");
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    System.out.println("setter: [address] ");
    this.address = address;
  }

  public int getPhone() {
    return phone;
  }

  public void setPhone(int phone) {
    System.out.println("setter: [phone] ");
    this.phone = phone;
  }

  public BeanFactory getBeanFactory() {
    return beanFactory;
  }

  public String getBeanName() {
    return beanName;
  }

  @Override

  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    System.out.println("BeanfactoryAware:setBeanFactory");
    this.beanFactory = beanFactory;
  }

  @Override
  public void setBeanName(String beanName) {
    System.out.println("BeanNameAware:setBeanName");
    this.beanName = beanName;
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("DisposableBean: destroy() method");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("InitializingBean : afterPropertiesSet() method");
  }

  public void myInit() {
    System.out.println("init-method configured in spring context");
  }

  public void myDestroy() {
    System.out.println("destroy-method configured in spring context");
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    System.out.println("ApplicationContextAware: setApplicationContex");
  }
}
