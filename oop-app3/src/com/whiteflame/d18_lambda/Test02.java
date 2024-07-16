package com.whiteflame.d18_lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Test02 {
    public static void main(String[] args) {
        double[] scores = {10.1, 2.2, 3.1, 4.5};
        System.out.println(Arrays.toString(scores));

        // 使用Lambda表达式简化setAll
        Arrays.setAll(scores, (int index) -> {
            return scores[index] * 0.5;
        });
        System.out.println(Arrays.toString(scores));

        // 进一步省略
        // 1.方法的参数类型可以省略
        Arrays.setAll(scores, (index) -> {
            return scores[index] * 0.5;
        });
        System.out.println(Arrays.toString(scores));

        // 2.方法的（）可以省略，前提只有一个参数
        Arrays.setAll(scores, index -> {
            return scores[index] * 0.5;
        });
        System.out.println(Arrays.toString(scores));

        // 3.如果lambda表达式方法体只有一行代码，可以省略{}不写
        //去掉分号，如果有return，去掉return
        Arrays.setAll(scores, index -> scores[index] * 0.5);
        System.out.println(Arrays.toString(scores));


    }
}
