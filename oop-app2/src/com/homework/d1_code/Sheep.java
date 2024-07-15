package com.homework.d1_code;

public class Sheep extends Animal {
    public Sheep() {
        setType("羊");
    }

    @Override
    void eat() {
        System.out.println(getType() + "啃草");
    }

}
