package com.practice.d2_static_method;

public class Student {

    int age;
    public static void staticMethod() {
        //静态方法
        System.out.println("静态方法调用了");
    }

    public void method() {
        System.out.println("实例方法调用了");
        //this.age = 10;
    }
}
