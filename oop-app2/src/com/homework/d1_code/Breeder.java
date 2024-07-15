package com.homework.d1_code;

public class Breeder extends Animal {
    public Breeder() {
        setType("饲养员");
    }

    @Override
    void eat() {
        System.out.println(getType() + "吃饭");
    }

    void breed(Animal animal) {
        //System.out.println("饲养" + animal.getType());
        animal.drink();
        animal.eat();
        if (animal instanceof Dog || animal instanceof Frog) {
            ((Swim) animal).swim();
        }
    }
}
