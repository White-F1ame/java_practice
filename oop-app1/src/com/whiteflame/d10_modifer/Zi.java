package com.whiteflame.d10_modifer;

import com.whiteflame.d9_modifer.Fu;

public class Zi extends Fu {
    //不同包下的子类
    public void test(){
        //同包下的其他类调用
        //privateMethod();
        //defaultMethod();
        protectedMethod();
        publicMethod();
    }
}
