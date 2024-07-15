package com.whiteflame.d5_block;

public class Test {
    public static void main(String[] args) {
        //静态代码块在加载时会执行，而且只执行一次
        //静态代码不需要创建对象就能执行
        System.out.println(Student.name);
        System.out.println(Student.score);

        //实例代码块每次创建对象之前都会执行一次
        Student student1 = new Student();
        System.out.println("student1.age = " + student1.age);
        Student student2 = new Student(20);
        System.out.println("student2.age = " + student2.age);



    }
}
