package com.whiteflame.day04.d1_stringbuilder;

import java.util.Scanner;

public class StringBuilderTest {
    public static void main(String[] args) {
        checkSymmetricString();
    }
    public static void checkSymmetricString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String strReverse = sb.reverse().toString();
        if (str.equals(strReverse)) {
            System.out.println("是一个对称的字符串");
        } else {
            System.out.println("不是一个对称的字符串");
        }
    }
}
