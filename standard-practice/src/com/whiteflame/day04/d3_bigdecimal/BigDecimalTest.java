package com.whiteflame.day04.d3_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
        double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};

        BigDecimal sum = BigDecimal.valueOf(0);

        for (int i = 0; i < arr.length; i++) {
            String str = Double.toString(arr[i]);
            BigDecimal bd = BigDecimal.valueOf(Double.parseDouble(str));
            sum = sum.add(bd);
        }
        String length = Integer.toString(arr.length);
        BigDecimal l = BigDecimal.valueOf(Double.parseDouble(length));
        BigDecimal avg = sum.divide(l, RoundingMode.HALF_UP);

        System.out.println(avg.doubleValue());
    }
}
