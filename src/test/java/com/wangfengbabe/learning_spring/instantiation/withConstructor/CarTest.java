package com.wangfengbabe.learning_spring.instantiation.withConstructor;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangfeng on 17/06/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-instantiation_with_constructor.xml",
    "classpath:spring/spring-dependency_setter.xml"})
public class CarTest {

  @Autowired
  @Qualifier("exampleBean_constructorDependency_default")
  private Car constructorDefault;

  @Autowired
  @Qualifier("exampleBean_constructorDependency_with_index")
  private Car constructorIndex;

  @Autowired
  @Qualifier("exampleBean_constructorDependency_with_name")
  private Car constructorName;

  @Autowired
  @Qualifier("exampleBean_constructorDependency_with_type")
  private Car constructorType;

  @Autowired
  @Qualifier("carWithSetterDependency")
  private Car carWithSetterDependency;

  @Test
  public void testPropertyShouldBeConstructedCorrectly() {
    assertThat(constructorName.getName(), equalTo("Benz"));
    assertThat(constructorName.getYears(), equalTo(30));
  }

  @Test
  public void testEveryConstructorShouldReturnEqualObject() {
    assertEquals(constructorType, carWithSetterDependency);
    assertThat(constructorIndex,
        allOf(equalTo(constructorType), equalTo(constructorName), equalTo(constructorDefault)));
  }

}