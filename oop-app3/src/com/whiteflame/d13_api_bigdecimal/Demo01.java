package com.whiteflame.d13_api_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo01 {
    public static void main(String[] args) {
        //学会使用BigDecimal对象
        double num1 = 0.1;
        double num2 = 0.2;
        //不推荐使用构造方法取创建BigDecimal对象
        //BigDecimal bd1 = new BigDecimal(num1);
        //BigDecimal bd2 = new BigDecimal(num2);
        //System.out.println(bd1.add(bd2));

        //推荐使用valueof()
        BigDecimal bd1 = BigDecimal.valueOf(num1);
        BigDecimal bd2 = BigDecimal.valueOf(num2);
        // +
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);
        // -
        System.out.println(bd1.subtract(bd2));
        // *
        System.out.println(bd1.multiply(bd2));
        // /
        System.out.println(bd1.divide(bd2));

        // 只能进行精准计算,如果得不到精确的值就会报异常
        double num3 = 0.3;
        //System.out.println(bd1.divide(bd3));//报错
        //解决办法
        BigDecimal rs = bd1.divide(bd3, 3, RoundingMode.HALF_UP);//精确到3位小数，四舍五入模式
        System.out.println(rs);

    }
}
