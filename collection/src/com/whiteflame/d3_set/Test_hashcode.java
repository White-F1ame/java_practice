package com.whiteflame.d3_set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class Test_hashcode {
    public static void main(String[] args) {
        Student s1 = new Student("A", 10, 10.1);
        Student s2 = new Student("B", 11, 11.1);
        Student s3 = new Student("C", 12, 12.1);
        Student s4 = new Student("C", 12, 12.1);
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        HashSet<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getAge() + " " + s.getHeight());
        }

    }
}

class Student {
    private String name;
    private int age;
    private double height;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(height, student.height) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Student() {
    }
}