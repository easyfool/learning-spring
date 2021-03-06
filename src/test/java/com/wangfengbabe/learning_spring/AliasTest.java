package com.wangfengbabe.learning_spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 14/06/2017.
 */
public class AliasTest {

  @Test
  public void testAlias() {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("classpath:spring/spring-alias.xml");
    HelloWorld helloWorld_wangfeng = (HelloWorld) context.getBean("wangfengHelloworld");
    HelloWorld helloWorld_zhaochi = (HelloWorld) context.getBean("zhaochiHelloworld");
  }

}
