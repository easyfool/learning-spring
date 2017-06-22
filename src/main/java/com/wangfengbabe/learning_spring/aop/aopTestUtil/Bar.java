package com.wangfengbabe.learning_spring.aop.aopTestUtil;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wangfeng on 22/06/2017.
 */
public class Bar implements IBar {

  @Autowired
  Dep dep;

  @Override
  public String perform(String message) {
    System.out.println("run bar " + message);
    return dep.perform("aspect");
  }
}
