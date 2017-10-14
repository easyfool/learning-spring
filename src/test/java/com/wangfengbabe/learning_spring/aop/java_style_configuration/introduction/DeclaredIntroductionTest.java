package com.wangfengbabe.learning_spring.aop.java_style_configuration
    .introduction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation
    .AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangfeng on 28/06/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
    com.wangfengbabe.learning_spring.aop.java_style_configuration.AppConfig
        .class})
public class DeclaredIntroductionTest {

  @Test
  public void testAddWorkInterfaceToWriter() {
    ApplicationContext context = new AnnotationConfigApplicationContext(
        com.wangfengbabe.learning_spring.aop.java_style_configuration
            .AppConfig.class);
    IWork worker = (IWork) context.getBean("writer");
    worker.work();
  }

}
