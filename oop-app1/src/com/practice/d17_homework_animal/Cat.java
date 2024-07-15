package com.practice.d17_homework_animal;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, String color, double price) {
        super(name, color, price);
    }
    public void catchMouse(){
        System.out.println(getName()+"抓老鼠");
    }
}
