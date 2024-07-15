package com.practice.d18_homework_bank;

public class Test {
    public static void main(String[] args) {
        MainCard mc = new MainCard(500.0,"12345678","张三");
        mc.save(600);
        mc.get(700);
        mc.get(1000);

        System.out.println("----------");

        SecondaryCard sc = new SecondaryCard(400,"87654321","李四",1000);
        sc.save(100);
        sc.get(200);
        sc.get(1000);



    }
}
