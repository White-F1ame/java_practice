package com.homework;

interface Inter {
    void show();
}
class Outer {
    //补齐代码，要求在控制台输出”HelloWorld”
    //static void method(){
        //void show(){}
    //}
}

class A implements Inter{
    public void show(){
        System.out.println("HelloWorld");
    }
}

public class OuterDemo {
    public static void main(String[] args) {
        //Outer.method().show();
    }
}
