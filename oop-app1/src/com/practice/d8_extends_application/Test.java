package com.practice.d8_extends_application;

public class Test {
    public static void main(String[] args) {
        F f = new F();
        System.out.println(f.hashCode());
        System.out.println(f.toString());
        System.out.println(f.getClass());

        Z z = new Z();
        System.out.println(z.hashCode());
        System.out.println(z.toString());
        System.out.println(z.getClass());
    }
}
class F{

}
class Z extends F{}