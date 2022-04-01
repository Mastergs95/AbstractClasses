package com.skillsoft.inheritandinterfaces;

public class Main {
    public static void main(String [] args){


        OnePlus onePlus= new OnePlus(499,true);
        Iphone iphone= new Iphone6S(1000,true);


        System.out.println(onePlus);
        System.out.println(iphone);

        System.out.println(onePlus.computeTotalPrice());
        System.out.println(iphone.computeTotalPrice());

    }
}
