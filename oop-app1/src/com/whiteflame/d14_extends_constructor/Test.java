package com.whiteflame.d14_extends_constructor;

public class Test {
    public static void main(String[] args) {
        Z z = new Z();
        Z z2 = new Z("hi");
    }
}

class F {
    public F() {
        System.out.println("父类无参构造器执行了");
    }
}

class Z extends F {
    String name;

    public Z() {
        //super();默认执行
        System.out.println("子类无参构造器执行了");
    }

    public Z(String name) {
        System.out.println("子类有参构造器执行了");
        System.out.println(name);
    }
}