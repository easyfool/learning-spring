package com.wangfengbabe.learning_spring.springBeanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by wangfeng on 18/06/2017.
 */
public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

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
    System.out.println("inject property [name] by setter");
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    System.out.println("inject property [address] by setter");
    this.address = address;
  }

  public int getPhone() {
    return phone;
  }

  public void setPhone(int phone) {
    System.out.println("inject property [phone] by setter");
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
    System.out.println("BeanfactoryAware.setBeanFactory is called");
    this.beanFactory = beanFactory;
  }

  @Override
  public void setBeanName(String beanName) {
    System.out.println("BeanNameAware.setBeanName is called");
    this.beanName = beanName;
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("destroy method is called with desposable bean");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("afterPropertiesSet method is called with InitializingBean");
  }

  public void myInit() {
    System.out.println("customerize initialize method is called  with init-method");
  }

  public void myDestroy() {
    System.out.println("customerize destroy method is called  with destroy-method");
  }
}
