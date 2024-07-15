package com.whiteflame.d2_static_method;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.score = 60;
        student2.score = 59;
        //推荐使用类名.类方法名()调用类方法
        Student.welcome();
        //不推荐使用对象.类方法这种方法调用类方法
        student2.welcome();

        //调用实例方法
        student1.jude();
        student2.jude();
    }
}
