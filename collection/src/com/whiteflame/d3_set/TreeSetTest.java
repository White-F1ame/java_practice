package com.whiteflame.d3_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<People> set = new TreeSet<>((o1, o2) -> o1.getAge()-o2.getAge());
        set.add(new People("雾雨魔理沙",18));
        set.add(new People("八云紫",17));
        set.add(new People("十六夜咲夜",20));
        set.add(new People("博丽灵梦",21));
        set.add(new People("藤原妹红",222));

        System.out.println(set);
    }
}

class People {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "People{" +
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

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People() {
    }
}