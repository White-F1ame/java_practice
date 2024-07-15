package com.practice.d17_homework_animal;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("旺财", "black", 60);
        d.eat();
        d.lookHome();

        Cat c = new Cat("波斯猫", "yellow", 1000);
        c.eat();
        c.catchMouse();
    }
}
