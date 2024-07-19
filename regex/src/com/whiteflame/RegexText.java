package com.whiteflame;

import java.util.Scanner;

public class RegexText {
    public static void main(String[] args) {

    }


    /**
     * 目标：校验用户输入的电话、邮箱、时间是否合法。
     */
    /**
     * 校验用户输入的电话是否合法。
     */
    public static void checkPhone(){
        while (true) {
            System.out.println("请您输入您的电话号码(手机|座机): ");
            Scanner sc = new Scanner(System.in);
            String phone = sc.nextLine();
            // 18676769999  010-3424242424 0104644535
            if(phone.matches("(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})")){
                System.out.println("您输入的号码格式正确~~~");
                break;
            }else {
                System.out.println("您输入的号码格式不正确~~~");
            }
        }
    }


    public static boolean StringCheck(String str) {
        if (str == null || str.length() < 7 || str.startsWith("0"))
            return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > 9)
                return false;
        }
        return true;
    }
}
