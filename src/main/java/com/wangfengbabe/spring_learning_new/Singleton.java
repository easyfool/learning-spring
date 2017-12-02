package com.wangfengbabe.spring_learning_new;

public class Singleton {

  private static Person person;
  private static Animal animal;

  private static Person createPerson() {
    person = new Person();
    return person;
  }

  private static Animal createAnimal() {
    animal = new Animal();
    return animal;
  }

}
