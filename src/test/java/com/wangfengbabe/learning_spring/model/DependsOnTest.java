package com.wangfengbabe.learning_spring.model;

import com.wangfengbabe.learning_spring.depends_on.Fish;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangfeng on 15/06/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-depends_on.xml")
public class DependsOnTest {

  @Autowired
  private Fish fish;

  @Test
  public void testDependsOnInitialize() {

  }


}