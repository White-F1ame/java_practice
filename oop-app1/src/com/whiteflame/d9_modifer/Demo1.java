package com.whiteflame.d9_modifer;

public class Demo1 {
    public static void main(String[] args) {
        Fu fu = new Fu();
        //同包下的其他类调用
        //fu.privateMethod();
        fu.defaultMethod();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
