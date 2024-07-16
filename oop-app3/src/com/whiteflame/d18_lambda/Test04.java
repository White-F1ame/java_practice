package com.whiteflame.d18_lambda;

public class Test04 {
    public static void main(String[] args) {
        Student st = new Student();

        StudentFactory sf = new StudentFactory() {
            @Override
            public Student createStudent(String name, int age, double score) {
                return new Student(name, age, score);
            }
        };

        //简化成lambda表达式
        StudentFactory sf2 = (name, age, score) -> new Student(name, age, score);

        //简化成构造引用
        StudentFactory sf3 = Student::new;

    }
}

interface StudentFactory {
    Student createStudent(String name, int age, double score);
}