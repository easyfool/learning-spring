package com.wangfengbabe.learning_spring.factorymethod;

/**
 * Created by wangfeng on 14/06/2017.
 */
public class Circle implements IShape {

  private double radius;
  private Point center;

  public Circle() {
  }

  public double getRadius() {

    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public Point getCenter() {
    return center;
  }

  public void setCenter(Point center) {
    this.center = center;
  }

  public Circle(double radius, Point center) {

    this.radius = radius;
    this.center = center;
  }
}
