package com.whiteflame.day07;

import java.util.HashSet;
import java.util.Objects;

public class Test02 {
    public static void main(String[] args) {
        HashSet<Roommate> roommates = new HashSet<>();
        roommates.add(new Roommate("赵丽颖", 18));
        roommates.add(new Roommate("杨幂", 19));
        roommates.add(new Roommate("范冰冰", 20));
        roommates.add(new Roommate("范冰冰", 20));
        System.out.println("我的室友是：" + roommates);
    }
}

class Roommate {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Roommate roommate = (Roommate) o;
        return age == roommate.age && Objects.equals(name, roommate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Roommate{" +
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

    public Roommate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Roommate() {
    }
}