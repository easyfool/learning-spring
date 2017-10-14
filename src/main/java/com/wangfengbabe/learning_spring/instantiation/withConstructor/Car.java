package com.wangfengbabe.learning_spring.instantiation.withConstructor;

/**
 * Created by wangfeng on 14/06/2017.
 */
public class Car {

    private int years;
    private String name;
    private Wheel wheels;

    public int getYears() {
        return years;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWheels(Wheel wheels) {
        this.wheels = wheels;
    }

    public Wheel getWheels() {
        return wheels;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        Car car = (Car) o;

        if (years != car.years) {
            return false;
        }

        if (!name.equals(car.name)) {
            return false;
        }
        return wheels.equals(car.wheels);
    }

    @Override public int hashCode() {
        int result = years;
        result = 31 * result + name.hashCode();
        result = 31 * result + wheels.hashCode();
        return result;
    }

    public Car(String name, int years, Wheel wheels) {
        this.years = years;
        this.name = name;
        this.wheels = wheels;

    }
}
