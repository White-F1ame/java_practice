package com.practice.d6_sigleInstance;

public class B {
    //懒汉式单例
    private static B b;

    private B() {
    }

    public static B getObject() {
        if (b == null) {
            b = new B();
            return b;
        } else {
            return b;
        }
    }
}
