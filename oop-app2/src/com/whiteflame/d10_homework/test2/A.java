package com.whiteflame.d10_homework.test2;

// 以下代码是否有问题？为什么？如何解决？
interface A{
    static void method(){// 1.
        System.out.println("A-method");
    }
    default void show(){//2.
        System.out.println("A-show");
    }
}
interface B{
    static void method(){// 3.
        System.out.println("B-method");
    }
    default void show(){//4.
        System.out.println("B-show");
    }
}
//interface C extends A,B{}
//一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承。