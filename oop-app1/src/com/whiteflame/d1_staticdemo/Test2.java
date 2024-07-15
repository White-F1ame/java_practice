package com.whiteflame.d1_staticdemo;

public class Test2 {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();

        int userCount = User.objectCount;
        System.out.println("创建的对象数量：" + userCount);
    }
}
