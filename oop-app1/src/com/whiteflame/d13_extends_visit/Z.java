package com.whiteflame.d13_extends_visit;

public class Z extends F{
    String name = "子类名称";
    public void showName(){
        String name = "局部名称";
        System.out.println(name);//局部名称
        System.out.println(this.name);//子类成员变量
        System.out.println(super.name);//父类成员变量
    }

    @Override
    public void print1(){
        System.out.println("执行子类方法");
    }
    public void showMethod(){
        print1();//子类的
        super.print1();//父类的
    }
}
