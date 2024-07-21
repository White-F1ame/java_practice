package com.whiteflame.day06;

import java.util.HashSet;

public class Test02 {
    public static void main(String[] args) {
        double[] arr = {2.2, 5.5, 6.6, 2.2, 8.8, 1.1, 2.2, 8.8, 5.5, 2.2, 6.6};
        HashSet<Double> set = new HashSet<>();
        for (double e : arr) {
            set.add(e);
        }
        System.out.println("去除重复的元素后，结果是：" + set);
    }
}
