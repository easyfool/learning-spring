package com.wangfengbabe.learning_spring.springBeanLifeCycle;

/**
 * Created by wangfeng on 20/06/2017.
 */
public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        System.out.println("constructor : Animal");
    }

    public void setName(String name) {
        System.out.println("setter:[name] in Animal");
        this.name = name;
    }
}
