package com.whiteflame.day06;

import java.util.Random;
import java.util.TreeSet;

public class Test01 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Random r = new Random();
        while (set.size() < 6) {
            int red = r.nextInt(33) + 1;
            set.add(red);
        }
        int blue = r.nextInt(16) + 1;
        System.out.println("红球：" + set + " | 蓝球：" + blue);
    }
}
