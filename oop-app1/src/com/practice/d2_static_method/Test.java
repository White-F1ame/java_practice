package com.practice.d2_static_method;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        //调用类方法 类名.类方法名
        Student.staticMethod();
        //stu.staticMethod();//不推荐

        //调用实例方法 对象.实例方法名
        stu.method();
        //Student.method();//错误，实例方法不能用类名调用
    }
}
