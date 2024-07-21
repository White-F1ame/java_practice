package com.whiteflame.day06;

import java.util.Random;
import java.util.TreeSet;

public class Test03 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Random r = new Random();
        int count = 1;
        while (set.size() < 8) {
            //int size = set.size();
            int num = r.nextInt(11) + 10;
            System.out.println("第" + count++ + "次生成的随机数是：" + num);
            set.add(num);
            //if (set.add(num)) {//只显示成功进入的数
            //    System.out.println("第" + set.size() + "次生成的随机数是：" + num);
            //}
        }
        System.out.println("集合中保存的8个不重复的随机数是：" + set);
    }
}
