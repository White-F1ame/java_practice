package com.whiteflame.day01.practice03.bean;

public class Person {
    private String name;
    private int age;
    public void eat(){
        System.out.println(this.name+"在吃饭");
    }
    public void rest(){
        System.out.println(this.name+"睡觉");
    }
    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
