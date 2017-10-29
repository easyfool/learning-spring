package com.wangfengbabe.learning_spring.javaconfig.teacher;

import org.springframework.stereotype.Component;

@Component("student2")
public class Student {

  public void say() {
    System.out.println("hello student2");
  }

}
