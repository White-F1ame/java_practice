package com.whiteflame.d6_singleInstance;

public class Test1 {
    //饿汉式单例，在加载类时就创建了一个对象，当有人想用对象时可直接使用
    public static void main(String[] args) {
        A a1 = A.getObject();
        A a2 = A.getObject();
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
    }
}
