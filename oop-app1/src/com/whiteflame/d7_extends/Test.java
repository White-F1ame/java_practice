package com.whiteflame.d7_extends;

public class Test {
    public static void main(String[] args) {
        B b = new B();

        System.out.println(b.i);
        //System.out.println(b.j);//错误,父类私有成员变量子类不能调用
        b.print1();
        //b.print2();//错误,父类私有成员变量子类不能调用
    }
}
