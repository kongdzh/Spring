package com.wonders.beans;

import java.util.List;

public class Person {
    protected String name;
    protected int age;

    private Car car;
    private List<Car> carList;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "com.wonders.beans.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
