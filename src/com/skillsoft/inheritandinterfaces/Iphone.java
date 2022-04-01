package com.skillsoft.inheritandinterfaces;

public abstract class Iphone extends Phone {

    private boolean airpods;

    public Iphone(float basePrice, boolean airpods){

        super("IOS", "Iphone 6s", basePrice);

        this.airpods=airpods;
    }



    @Override
    public String toString(){
        String superString=super.toString();

        return String.format("%s, airpods: %s", superString, airpods);
    }
}
