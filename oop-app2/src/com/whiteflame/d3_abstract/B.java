package com.whiteflame.d3_abstract;

//抽象类可以作为父类让子类继承
//子类继承父类必须重写父类的所有抽象方法
public class B extends A{
    @Override
    public void method(){
        System.out.println("funny");
    }
}
