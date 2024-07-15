package com.whiteflame.d9_api_stringbuilder;

public class Demo01 {
    public static void main(String[] args) {
        //StringBuilder使用
        StringBuilder sb1 = new StringBuilder();
        sb1.append("博丽");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("十六夜咲夜");
        System.out.println(sb2);

        StringBuilder sb3 = sb1.append("灵梦");
        System.out.println(sb3);
        System.out.println(sb1);
        sb1.append(100);
        System.out.println(sb1);
        System.out.println(sb3);

        //链式编程，返回值是对象时支持链式编程
        System.out.println(sb2.append("完美").append("潇洒").append("女仆"));

        //将对象的内容进行反转
        System.out.println(sb2.reverse());

        //获取对象内容的长度
        System.out.println(sb2.length());

        //将StringBuilder对象转换成String对象
        String s = sb2.toString();
        System.out.println(sb2);//相当于sb2.toString();
        System.out.println(s);


    }
}
