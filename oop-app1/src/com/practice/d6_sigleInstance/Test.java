package com.practice.d6_sigleInstance;

public class Test {
    public static void main(String[] args) {
        A a1 = A.getObject();
        A a2 = A.getObject();
        System.out.println(a1 == a2);

        B b1 = B.getObject();
        B b2 = B.getObject();
        System.out.println(b1 == b2);
    }
}
