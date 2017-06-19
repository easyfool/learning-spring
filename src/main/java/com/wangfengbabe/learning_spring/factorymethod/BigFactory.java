package com.wangfengbabe.learning_spring.factorymethod;

/**
 * Created by wangfeng on 14/06/2017.
 */
public class BigFactory {

  private static IBook biography = new Biography();
  private static IShape circle = new Circle();

  public IBook createBiography() {
    return biography;
  }

  public IShape createCircle() {
    return circle;
  }

}
