package com.homework;

import java.util.Arrays;
import java.util.Comparator;

// 以下代码是否有问题？为什么？如何解决？
public class Demo01 {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 3, 1, 4};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });


        System.out.println(Arrays.toString(arr));
    }
}