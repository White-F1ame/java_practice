package com.homework.d1_code;

public class Frog extends Animal implements Swim {
    public Frog() {
        setType("蛙");
    }

    @Override
    void eat() {
        System.out.println(getType() + "吃虫子");
    }

    @Override
    public void swim() {
        System.out.println(getType() + "蛙泳");
    }
}
