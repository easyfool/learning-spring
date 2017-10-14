package com.wangfengbabe.learning_spring.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangfeng on 15/06/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-beans.xml")
public class LazyInitializeTest {

    // @Autowired
    // private Lazy lazy;

    @Test public void testShouldLazyInitialize() {

    }

}
