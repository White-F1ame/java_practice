package com.whiteflame.d1_ploymorphism_02;

public class Test {
    public static void main(String[] args) {
        //掌握多态的使用 父类引用 指向 子类对象
        Fu f1 = new Zi();//对象多态
        Fu f2 = new Nv();
        f1.run();//行为多态
        f2.run();
        //属性（成员变量）不谈多态
        System.out.println(f1.name);
        System.out.println(f2.name);

        //掌握多态的好处
        //可以解耦
        //定义方法时，使用父类形参，可接收一切子类对象
        Fu.father(f1);
        Fu.father(f2);

    }
}
