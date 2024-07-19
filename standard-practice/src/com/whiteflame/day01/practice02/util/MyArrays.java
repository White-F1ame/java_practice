package com.whiteflame.day01.practice02.util;

import java.util.Arrays;
import java.util.StringJoiner;

public class MyArrays {
    private MyArrays() {
    }

    /**
     * 1.定义一个方法getMax(int[] arr)，可以接受一个整数数组，方法中实现获取数组的最大值并且返回.
     * @param arr 整型数组
     * @return max_value
     */
    public static int getMax(int[] arr) {
        if (arr != null && arr.length > 0) {
            int max_value = arr[0];
            for (int i = 0; i < arr.length; i++) {
                max_value = Math.max(max_value, arr[i]);
            }
            return max_value;
        }
        return -1;
    }

    /**
     * 2.定义一个方法toString(int[] arr),可以接受一个整数数组，
     * 方法中实现把数组的内容拼接成一个字符串，并且返回。
     * 格式如：[11, 22, 33, 44]
     * @param arr 整型数组
     * @return
     */
    public static String toString(int[] arr){
        //用StringBuilder写：
        // 数组为null返回null
        if (arr == null)
            return "null";
        int iMax = arr.length - 1;
        // 数组为空返回-1
        if (iMax == -1)
            return "[]";
        // 创建sb对象
        StringBuilder b = new StringBuilder();
        // 开头添加[
        b.append('[');
        // 遍历数组
        for (int i = 0; ; i++) {
            // 字符串末尾添加数组元素
            b.append(arr[i]);
            // 如果到最后一个元素，末尾添加]后sb对象调用toString转为字符串后返回
            if (i == iMax)
                return b.append(']').toString();
            // 不是最后一个元素则在末尾加逗号
            b.append(", ");
        }
    }

}
