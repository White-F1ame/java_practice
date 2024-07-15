package com.whiteflame.d3_util;

import java.util.Random;

/**
 * 工具类
 */
public class MyUtil {
    //工具类里的方法都是静态的，不需要创建对象，为了防止使用对象调用，所以一般会用private私有化构造器
    private MyUtil() {
    }

    /**
     * 创建一个以0~9，a~z,A~Z的长度为codeLength的验证码
     *
     * @param codeLength
     * @return int code
     */
    public static String createCode(int codeLength) {
        String code = "";
        String codeBasic = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        for (int i = 0; i < codeLength; i++) {
            code += codeBasic.charAt(random.nextInt(62));
        }
        return code;
    }
}
