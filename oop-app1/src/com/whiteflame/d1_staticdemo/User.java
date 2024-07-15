package com.whiteflame.d1_staticdemo;

public class User {
    //当某个数据只需要一份，且希望能被共享时，可以使用类变量
    public static int objectCount = 0;

    //当创建对象时会调用这个无参构造，然后调用类变量objectCount，计算创建了多少个对象
    public User(){
        User.objectCount++;
    }
}
