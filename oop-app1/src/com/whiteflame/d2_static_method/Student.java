package com.whiteflame.d2_static_method;

public class Student {
    double score;

    //static修饰方法时，方法为类方法，通过类名.类方法名()调用
    public static void welcome() {
        System.out.println("Hello Everyone!");
    }

    //无static修饰时，方法为实例方法，属于对象，通过对象.实例方法()调用
    public void jude() {
        if (score < 60) {
            System.out.println("击毙你！");
        } else {
            System.out.println("你过关！");
        }
    }
}
