package com.homework.d1_code;

public class Test {
    public static void main(String[] args) {
        Breeder breeder = new Breeder();
        Animal dog = new Dog();
        Animal frog = new Frog();
        Animal sheep = new Sheep();

        breeder.breed(dog);
        breeder.breed(frog);
        breeder.breed(sheep);
    }
}
