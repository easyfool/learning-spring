package com.wangfengbabe.learning_spring;

import static org.hamcrest.MatcherAssert.assertThat;

import com.wangfengbabe.learning_spring.factorymethod.Biography;
import com.wangfengbabe.learning_spring.factorymethod.IBook;
import com.wangfengbabe.learning_spring.factorymethod.IShape;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangfeng on 14/06/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
    ("classpath:spring/spring-instantiation_with_instance_factory_method.xml")
public class BigFactoryTest {

    @Autowired @Qualifier("biography") private IBook biography1;

    @Autowired private IShape circle;


    @Test public void createBiography() throws Exception {
        assertThat(biography1, IsInstanceOf.instanceOf(Biography.class));
    }

    @Test public void createCircle() throws Exception {
    }

}
