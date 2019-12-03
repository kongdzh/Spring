package com.wonders.factories;

import com.wonders.beans.Car;

public class CarInstanceFactory {
    public Car getCar(String name) {
        System.out.println("实例工厂正在创建...");
        Car car = new Car();
        car.setBand(name);
        car.setPrice(2000000);

        return car;
    }
}
