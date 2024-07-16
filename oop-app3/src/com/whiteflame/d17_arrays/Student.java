package com.whiteflame.d17_arrays;

//plan A 让该类实现Comparable 比较规则接口，代表该类的对象可用于比较
public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Student() {
    }

    @Override
    public int compareTo(Student student) {
        //当前对象this 与 参数
        /*if (this.age > student.age) {
            return 1;
        } else if (this.age < student.age) {
            return -1;
        }
        return 0;*/
        //return this.age - student.age;//升序
        return student.age - this.age;//升序
    }
}
