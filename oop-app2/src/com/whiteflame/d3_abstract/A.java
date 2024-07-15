package com.whiteflame.d3_abstract;

//abstract 修饰类，这个类就是抽象类
public abstract class A {
    //抽象类中类的成员都可以存在，类的成员：成员变量、成员方法、构造器
    private String name;
    public void say(){
        System.out.println("Hello");
    }

    public A() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //abstract 修饰方法，这个方法就是抽象方法
    //抽象方法没有方法体
    public abstract void method();
}
