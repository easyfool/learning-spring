package com.wangfengbabe.learning_spring.aop.aopTestUtil;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.AopTestUtils;
import org.springframework.test.util.ReflectionTestUtils;

/**
 * 通过AopTestUtils解决ReflectionTestUtils赋值切面对象的问题
 *
 * @author zhanyongzhi
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-aopTestUtil.xml")
public class AopTestUtilTest {

  @Mock
  Dep dep;

  @Autowired
  private BarAspect barAspect;

  @Autowired
  ApplicationContext applicationContext;

  @Autowired
  @InjectMocks
  IBar bar;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    // 对象默认返回aspect,修改为返回mock
    when(dep.perform("aspect")).thenReturn("mock");
  }

  @Test
  public void testDefault() {
    String tRet = bar.perform("hello");
    System.out.println(tRet);
    // mock注入无效,仍然返回aspect
    if ("!aspect".equals(tRet)) {
      Assert.fail("perform return not equeal aspect");
    }
  }

  @Test
  public void testAopUtils() {
    // 获取真实的代理对象
    Bar tBar = AopTestUtils.getTargetObject(bar);
    ReflectionTestUtils.setField(tBar, "dep", dep);

    String tRet = bar.perform("hello");

    // 此时才真正mock到
    if (!"mock".equals(tRet)) {
      Assert.fail("perform return not equeal mock");
    }
  }
}
