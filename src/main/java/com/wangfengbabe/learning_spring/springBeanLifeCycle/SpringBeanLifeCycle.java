package com.wangfengbabe.learning_spring.springBeanLifeCycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 18/06/2017.
 */
public class SpringBeanLifeCycle {

  private static final Logger LOGGER = LoggerFactory.getLogger(SpringBeanLifeCycle.class);

  public static void main(String[] args) {
    System.out.println("initialize context container");
    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
        "classpath:spring/spring-beans_lifecycle.xml");
    Animal animal = (Animal) context.getBean("animal");
    
    Person person = (Person) context.getBean("person");

    System.out.println("close context container");
    context.registerShutdownHook();
  }

}
