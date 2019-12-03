package com.wonders.beans;

public class Car {
    private String band;
    private int price;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "com.wonders.beans.Car{" +
                "band='" + band + '\'' +
                ", price=" + price +
                '}';
    }
}
