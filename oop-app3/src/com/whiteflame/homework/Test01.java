package com.whiteflame.homework;

import java.math.BigDecimal;

/**
 * 已知手机的价格是3999, 钢化膜的价格是9.9, 店家促销策略为:
 * 满4000打98折.   现在小明买了一台手机和两块钢化膜, 请问小明应该付多少钱(精确到分)？
 */
public class Test01 {
    public static void main(String[] args) {
        double phonePrice = 3999;
        double protectorPrice = 9.9;
        double totalprice = 0;
        double discount = 0.98;
        BigDecimal num1 = BigDecimal.valueOf(phonePrice);
        BigDecimal num2 = BigDecimal.valueOf(protectorPrice);
        BigDecimal num3 = BigDecimal.valueOf(totalprice);

        num3 = num1.add(num2).add(num2);
        if (num3.doubleValue()>4000){
            num3 = num3.multiply(BigDecimal.valueOf(discount));
        }
        System.out.println(num3);
        //System.out.println((3999+9.9+9.9)*0.98);
    }
}
