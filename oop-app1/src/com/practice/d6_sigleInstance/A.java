package com.practice.d6_sigleInstance;

public class A {
    //饿汉式单例
    private static A a = new A();

    //私有化构造器
    private A() {

    }

    //公共方法
    public static A getObject() {
        return a;
    }
}
