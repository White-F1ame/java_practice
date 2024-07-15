package com.whiteflame.d10_modifer;

import com.whiteflame.d9_modifer.Fu;

public class Demo2 {
    public static void main(String[] args) {
        //不同包下的不同类
        Fu fu = new Fu();
        //同包下的其他类调用
        //fu.privateMethod();
        //fu.defaultMethod();
        //fu.protectedMethod();
        fu.publicMethod();
    }
}
