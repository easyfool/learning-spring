package com.wangfengbabe.learning_spring.lazy_initialize;

/**
 * Created by wangfeng on 15/06/2017.
 */
public class Lazy {

  static {
    System.out.println("Lazy static block");
  }

  {
    System.out.println("Lazy constructor block");
  }

}
