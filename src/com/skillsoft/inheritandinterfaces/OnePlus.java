package com.skillsoft.inheritandinterfaces;

public class OnePlus extends Phone {

    private boolean stylusSupport;

    public OnePlus(float basePrice, boolean stylusSupport){

        super("Android", "OnePlus", basePrice);

        this.stylusSupport=stylusSupport;
    }

    @Override
    public double computeTotalPrice() {
        return getBasePrice()+getBasePrice()*0.05;
    }

    @Override
    public String toString(){
        String superString=super.toString();

        return String.format("%s, stylusSupport: %s", superString, stylusSupport);
    }
}
