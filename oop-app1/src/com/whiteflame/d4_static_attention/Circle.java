package com.whiteflame.d4_static_attention;

public class Circle {
    static double pai = 3.14;//类变量
    double radius;//实例变量

    //类方法中可以直接访问类的成员，不可以直接访问实例成员
    public static void circumference(double diameter){
        //注意：同一个类中，访问类成员可以省略类名不写
        double number = diameter *pai;//访问类成员
        printNumber(number);//访问类方法

        //System.out.println("半径为：" + radius);//错误，类方法中不可以直接访问实例变量
        //sayHappy();//错误，类方法中不能直接访问实例方法
        //System.out.println(this);//错误，类方法中不能使用this关键字

    }

    public static void printNumber(double number){
        System.out.println(number);
    }

    //实例方法中既可以访问类成员，也可以访问实例成员
    public void setRadius(double r){
        pai = 3.1415;//实例方法中访问类变量
        printNumber(r);//实例方法中访问类方法

        System.out.println("radius = " + radius);//实例方法中访问实例变量
        sayHappy();//实例方法中访问实例方法

        this.radius = r;//实例方法中可以出现this关键字，
        System.out.println(this);
    }

    //实例方法
    public void sayHappy(){
        System.out.println("Happy!");
    }
}
