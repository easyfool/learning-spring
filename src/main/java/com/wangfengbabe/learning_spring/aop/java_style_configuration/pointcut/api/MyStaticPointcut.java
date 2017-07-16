package com.wangfengbabe.learning_spring.aop.java_style_configuration.pointcut.api;

import java.lang.reflect.Method;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

/**
 * Created by wangfeng on 28/06/2017.
 */
public class MyStaticPointcut extends StaticMethodMatcherPointcut {


  @Override
  public boolean matches(Method method, Class<?> aClass) {
    return "foo".matches(method.getName());
  }

  public ClassFilter getClassFilter() {
    return new ClassFilter() {
      @Override
      public boolean matches(Class<?> aClass) {
        return aClass == BeanOne.class;
      }
    };
  }
}
