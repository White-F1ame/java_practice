package com.practice.d15_homework;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}

// 以下代码是否有问题？为什么？如何解决？
class A {
    int a_a = 10;
    static int a_b = 20;
}

class B extends A {
    int b_a = 100;
    static int b_b = 200;

    public static void show() {
        //System.out.println(super.a_a);//
        //System.out.println(this.b_a);
        System.out.println(a_b);
        System.out.println(b_b);
    }
}
