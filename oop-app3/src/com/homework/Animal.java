package com.homework;

public class Animal {
    public void eat() {
        System.out.println("动物吃饭");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫");
    }
}

class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        Dog d = (Dog) a;
        d.eat();
    }
}