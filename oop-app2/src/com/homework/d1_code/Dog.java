package com.homework.d1_code;

public class Dog extends Animal implements Swim {

    public Dog() {
        setType("狗");
    }

    @Override
    void eat() {
        System.out.println(getType() + "啃骨头");
    }

    @Override
    public void swim() {
        System.out.println(getType() + "会狗刨");
    }
}
