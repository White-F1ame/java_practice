package com.whiteflame.d7_extends;

public class B extends A {
    public void print3(){
        System.out.println(i);
        print1();

        //System.out.println(j);//错误,不能调用父类私有成员变量
        //print2();//错误,不能调用父类私有成员方法
    }
}
