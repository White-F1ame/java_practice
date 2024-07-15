package com.whiteflame.d6_singleInstance;

/**
 * 饿汉式单例
 */
public class A {
    //定义一个私有类变量并传入对象地址值
    private static A a = new A();
    //定义私有构造器，不让外部创建对象
    private A (){
    }
    //通过类方法调用类变量获取对象
    public static A getObject(){
        return a;
    }
}
