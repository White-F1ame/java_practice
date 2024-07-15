package com.whiteflame.d9_api_stringbuilder;

public class Demo02 {
    public static void main(String[] args) {
        //需求：对数据进行100万次的拼接操作
        //不推荐使用String直接拼接大量的字符串
        /*String s = "";
        for (int i = 0; i < 1000000; i++) {
            s += "东方";
            System.out.println(i);
        }
        System.out.println(s);*/

        //推荐使用StringBuilder做字符串的拼接操作，性能更好
        StringBuilder s =new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            s.append("东方");
            System.out.println(i);
        }
        System.out.println(s);


    }
}
