package com.whiteflame.day05.d2_lambda;

public class LambdaTest {
    public static void main(String[] args) {
        Phone p = (name) -> System.out.println("给" + name + "发送了一条消息");
        p.sendMessage("张三");
    }
}
