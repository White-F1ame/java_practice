package com.practice.d1_staticdemo;

public class People {
    static String name = "人类";//类变量
    static int count = 0;

    int age;//实例变量
    public People(){
        System.out.println("创建了对象");
        count++;
    }
}
