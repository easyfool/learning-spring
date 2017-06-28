package com.wangfengbabe.learning_spring.aop.java_style_configuration.introduction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 28/06/2017.
 */
@Aspect
@Component
public class WorkerAndWriter {

  @DeclareParents(value = "com.wangfengbabe.learning_spring.aop.java_style_configuration.introduction.IWrite+", defaultImpl = Worker.class)
  public static IWork worker;


}
