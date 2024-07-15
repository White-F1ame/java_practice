package com.whiteflame.d7_interface_studentsystem_demo;

public class Student {
    private String name;    //姓名
    private char sex;   //性别
    private double score;   //成绩

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, char sex, double score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public Student() {
    }
}
