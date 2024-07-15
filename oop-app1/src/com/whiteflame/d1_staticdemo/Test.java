package com.whiteflame.d1_staticdemo;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();

        //类变量的调用： 类名.类变量名
        System.out.println("Student.name = " + Student.name);
        Student.name = "永恩";
        System.out.println("Student.name = " + Student.name);
        //类变量不推荐使用 对象名.类变量名 的方式调用
        stu1.name = "亚托克斯";
        System.out.println("stu1.name = " + stu1.name);
        System.out.println("stu2.name = " + stu2.name);

        //实例变量：独属于每个对象自己的变量
        //实例变量的调用： 对象.实例变量
        stu1.age = 18;
        stu2.age = 22;
        System.out.println("stu1.age = " + stu1.age);
        System.out.println("stu2.age = " + stu2.age);

    }
}
