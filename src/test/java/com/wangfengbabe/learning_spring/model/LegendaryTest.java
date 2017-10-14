package com.wangfengbabe.learning_spring.model;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import com.wangfengbabe.learning_spring.factorymethod.IBook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangfeng on 14/06/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
    ("classpath:spring/spring-instantiation_with_instance_factory_method.xml")
public class LegendaryTest {

    @Autowired IBook legendary;

    @Test public void testStaticFactoryMethod() {
        assertThat(legendary, notNullValue());
    }

}
