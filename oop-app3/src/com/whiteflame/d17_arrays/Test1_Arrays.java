package com.whiteflame.d17_arrays;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;

public class Test1_Arrays {
    public static void main(String[] args) {
        //掌握使用Arrays工具类
        int[] arr = {10,20,30,40,55};

        // 打印数组的内容 toString()
        System.out.println(Arrays.toString(arr));

        // 拷贝数组 左闭右开
        int[] arr2 = Arrays.copyOfRange(arr, 1, 4);
        //不会索引越界
        int[] arr3 = Arrays.copyOfRange(arr, 1, 10);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        // 根据长度拷贝
        int[] arr4 = Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arr4));

        //修改数组的元素数据
        double[] scores = {1,4,5.0,2,3};

        Arrays.setAll(scores, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int index) {
                double score = scores[index] * 0.5;
                return score;
            }
        });

        System.out.println("-------");

        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(scores));

        // 数组排序
        System.out.println("-------");
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));


    }
}
