package com.whiteflame.day05.d5_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String phoneNumber = sc.next();
        if (checkPhoneNumber(phoneNumber)) {
            System.out.println("成功录入：" + phoneNumber);
        } else {
            System.out.println("失败");
        }
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        String regex = "(1[3,9]\\d{9})";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phoneNumber);
        if (m.find()) {
            return true;
        }
        return false;
    }
}
