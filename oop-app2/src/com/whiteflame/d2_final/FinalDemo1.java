package com.whiteflame.d2_final;

public class FinalDemo1 {
    public static void main(String[] args) {
        //final修饰变量，变量只能赋值一次
        final int a = 10;
        //a = 11;//不能二次赋值

        pay(10);

        //final修饰引用数据类型，地址值不能二次赋值，但地址里存放的数据可以改变
        final int[] arr = new int[]{1,2,3};
        //arr = null;不能二次赋值
        arr[0] = 4;//存放的数据可改
    }
    public static void pay(final int b){
        //b = 20;//不能二次赋值
    }

}
//final修饰类，类不能被继承了
final class A{
}
//class B extends A {}//不能继承

//final修饰方法，方法不能被重写了
class C {
    public final void printHi(){
        System.out.println("Hi");
    }
}
class D extends C {
    /*@Override//不能重写
    public void printHi(){}*/
}