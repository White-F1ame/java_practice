package com.whiteflame.d6_singleInstance;

/**
 * 懒汉式单例
 */
public class B {
    //定义一个私有化类变量
    private static B b;
    //私有化构造器
    private B(){
    }
    //通过类方法创建对象
    public static B getInstance(){
        if (b==null){//对象还没创建时创建对象
            System.out.println("第一次创建对象");
            b = new B();
            return b;
        }
        //创建过对象则使用之前创建的那个对象
        return b;
    }
}
