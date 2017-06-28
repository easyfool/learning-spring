package com.wangfengbabe.learning_spring.aop.java_style_configuration.advice;

import com.wangfengbabe.learning_spring.aop.java_style_configuration.service.IPerform;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangfeng on 28/06/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.wangfengbabe.learning_spring.aop.java_style_configuration.AppConfig.class})
public class AfterThrowingExampleTest {


  @Autowired
  @Qualifier("sing")
  private IPerform perform;

  @Test
  public void testApplauseAfterPerformance() throws Exception {
    perform.perform(0);
  }

}