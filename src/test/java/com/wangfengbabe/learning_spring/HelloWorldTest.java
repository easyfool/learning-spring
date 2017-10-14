package com.wangfengbabe.learning_spring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * HelloWorld Tester.
 *
 * @author wangfeng
 * @version 1.0
 * @since
 * 
 *        <pre>
 *        04 / 16 / 2017
 *        </pre>
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-helloWorld.xml")
public class HelloWorldTest {

  @Rule
  public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

  @Autowired
  HelloWorld helloWorld;

  @Test
  public void testInjectedBeanShouldNotBeNull() {
    assertThat(helloWorld, notNullValue());
  }

  @Test
  public void testMessageShouldBeCorrect() throws Exception {
    assertThat(helloWorld.getMessage(), equalTo("hello world"));
  }

}
