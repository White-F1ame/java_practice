package com.whiteflame.d6_interface;

//一个类可以实现多个接口
//接口不能直接用来创建对象
//弥补了单继承的不足
//让程序可以面向接口编程，这样既不用关心实现的细节，也可以灵活方便的切换各种实现
//书写格式：class 类名 extends 父类名 implements 接口名1, 接口名2, ...
public class AImpl extends People implements A, B, C {

    //当类实现了接口后,要么重写所有方法，要么变为抽象类
    @Override
    public void test() {
        System.out.println(NAME);
    }

    @Override
    public void run() {
        System.out.println("RUN!");
    }

    @Override
    public void showInfo() {

    }
}
