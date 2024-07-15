package com.whiteflame.d6_singleInstance;

public class Test2 {
    public static void main(String[] args) {
        //懒汉式单例,事先不创建对象,当想使用时再创建对象
        //通过类方法调用类变量创建对象
        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println(b1==b2);
    }
}
