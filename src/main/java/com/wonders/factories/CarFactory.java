package com.wonders.factories;

import com.wonders.beans.Car;

public class CarFactory {
    public static Car getCar(String name) {
        System.out.println("静态工厂正在创建...");
        Car car = new Car();
        car.setBand(name);
        car.setPrice(4000000);

        return car;
    }
}
