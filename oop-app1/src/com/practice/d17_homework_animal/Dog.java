package com.practice.d17_homework_animal;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, String color, double price) {
        super(name, color, price);
    }
    public void lookHome(){
        System.out.println(getName()+"看家");
    }
}
