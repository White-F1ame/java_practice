package com.whiteflame.d2_inner_class3;

public class Test2 {
    public static void main(String[] args) {
        Swimming cat = new Cat();
        go(cat);

        //匿名内部类的作用，主要用于作为一个参数传递给方法
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("我特么要淹死了");
            }
        });
    }

    public static void go(Swimming swimming){
        System.out.println("游泳开始=======");
        swimming.swim();
    }
}

