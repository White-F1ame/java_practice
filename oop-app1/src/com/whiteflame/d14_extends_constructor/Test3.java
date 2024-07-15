package com.whiteflame.d14_extends_constructor;

//通过this()调用本类其他有参构造
public class Test3 {
    public static void main(String[] args) {
        Student st = new Student("明",18);
        System.out.println(st.getName()+st.getAge()+st.getScore());
    }
}
class Student{
    private String name;
    private int age;
    private double score;

    public Student(String name, int age) {
        this(name,age,60);//通过this()调用本类其他有参构造
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
