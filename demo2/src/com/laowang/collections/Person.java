package com.laowang.collections;

import java.util.List;

/**
 * Created by Administrator on 2016/6/12.
 */
public class Person {
    private String name;
    private int age;

    public List<Car> getCar() {
        return cars;
    }
    public void setCar(List<Car> cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private List<Car> cars;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + cars +
                '}';
    }
}
