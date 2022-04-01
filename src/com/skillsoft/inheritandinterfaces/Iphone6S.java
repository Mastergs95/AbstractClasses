package com.skillsoft.inheritandinterfaces;

public class Iphone6S extends Iphone{
    public Iphone6S(float basePrice, boolean airpods) {
        super(basePrice, airpods);
    }

    @Override
    public double computeTotalPrice() {
        return getBasePrice()+getBasePrice()*0.10;
    }
}
