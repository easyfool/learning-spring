package com.wangfengbabe.learning_spring.instantiation.withConstructor;

/**
 * Created by wangfeng on 17/06/2017.
 */
public class Wheel {

  private String name;

  public Wheel() {

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    Wheel wheel = (Wheel) o;

    return name.equals(wheel.name);
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }

  public Wheel(String name) {
    this.name = name;

  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
