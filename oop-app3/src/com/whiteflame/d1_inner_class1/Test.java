package com.whiteflame.d1_inner_class1;

public class Test {
    public static void main(String[] args) {
        //外部类名.内部类名 对象名 = new 外部类名().new 内部类名();
        Outer.Inner in = new Outer().new Inner();

        in.method();
    }
}
