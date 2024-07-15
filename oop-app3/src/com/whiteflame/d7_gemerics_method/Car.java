package com.whiteflame.d7_gemerics_method;

public class Car extends Vehicle {
    public <E> E go(E e){
        System.out.println("go go go!");
        return e;
    }
}
