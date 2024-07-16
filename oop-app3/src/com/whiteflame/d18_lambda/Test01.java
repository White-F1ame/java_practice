package com.whiteflame.d18_lambda;

public class Test01 {
    public static void main(String[] args) {
        //掌握lambda表达式的写法
        test(new programming() {
            @Override
            public void program() {
                System.out.println("抱头蹲防！/O\\");
            }
        });

        test(() -> {
            System.out.println("呃呃");
        });

        // 类、抽象类都不支持lambda表达式
        /*
        test2(() -> {
            System.out.println("跑吧，孩子你无敌了...");
        });*/

        test3(() -> {
            System.out.println("向前向前向前~");
        });

    }

    public static void test(programming p) {
        p.program();
    }

    public static void test2(Car c) {
        c.run();
    }

    public static void test3(move man){
        man.ahead();
    }
}

// 前提条件1：必须是一个接口
interface programming {
    // 前提条件2：必须是抽象方法，且仅有一个
    void program();
}

abstract class Car {
    public abstract void run();
}

interface move {
    void ahead();
}