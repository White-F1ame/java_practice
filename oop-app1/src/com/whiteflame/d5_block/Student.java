package com.whiteflame.d5_block;

public class Student {
    static int score = 80;
    static String name = "damn";

    //静态代码块
    static {
        System.out.println("静态代码块在类加载时会执行一次");
        name = "但使龙城飞将在";
    }

    int age;

    //实例代码块
    {
        System.out.println("实例代码块执行了");
        age = 18;
        System.out.println("创建了对象" + this);
    }

    public Student() {
        System.out.println("无参构造器执行了");
    }

    public Student(int age) {
        System.out.println("有参构造器执行了");
    }
}
