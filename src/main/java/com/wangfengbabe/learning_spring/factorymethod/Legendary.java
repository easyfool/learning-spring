package com.wangfengbabe.learning_spring.factorymethod;

/**
 * Created by wangfeng on 14/06/2017.
 */
public class Legendary implements IBook {

  private String name;
  private double price;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Legendary() {

  }

  public Legendary(String name, double price) {

    this.name = name;
    this.price = price;
  }
}
