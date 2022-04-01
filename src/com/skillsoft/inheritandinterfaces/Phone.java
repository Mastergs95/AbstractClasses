package com.skillsoft.inheritandinterfaces;

public abstract class Phone {

    private final String operatingSystem;
    private final String brandName;
    private final float basePrice;

    public Phone(String operatingSystem, String brandName, float basePrice){

        this.operatingSystem=operatingSystem;
        this.brandName=brandName;
        this.basePrice=basePrice;

    }

    protected float getBasePrice(){
        return basePrice;
    }

    public abstract double computeTotalPrice();

    @Override
    public String toString(){

        return String.format("Operating system: %s, Brand: %s, Base price: %s",operatingSystem,brandName,basePrice);
    }
}
