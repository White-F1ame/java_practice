package com.whiteflame.homework;

import java.math.BigDecimal;

public class Test02 {
    public static void main(String[] args) {
        /**
         * 日常开发中，浮点数参数运算场景不少，
         * 但是java中浮点数在运算时往往不够精确，
         * 所以需要别的方式来解决，请并且给出精确输出(得到结果为0.2)的代码！
         */
        double a = 0.1;
        double b = 0.5;
        BigDecimal num1 = BigDecimal.valueOf(a);
        BigDecimal num2 = BigDecimal.valueOf(b);
        System.out.println(num1.divide(num2,1));

    }
}
