package com.whiteflame.day06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getAge() - s2.getAge();
            }
        });
        students.add(new Student(16, "咲夜"));
        students.add(new Student(11, "关夜"));
        students.add(new Student(12, "夜"));

        //students.forEach(s -> System.out.println(s));
        //HashMap<String, String> map = new HashMap<>();
        //map.put("小米", "红色");
        //map.put("小米", "蓝色");
        //System.out.println(map);
        //ArrayList<String> al = new ArrayList<String>();
        //al.add(true);
        //al.add(123);
        //al.add("abc");
        //System.out.println(al);
    }
}

class Student {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
