package com.wangfengbabe.learning_spring.factorymethod;

/**
 * Created by wangfeng on 14/06/2017.
 */
public class BookFactory {

    private static IBook legendary = new Legendary();

    public static IBook createLegendary() {
        return legendary;
    }

}
