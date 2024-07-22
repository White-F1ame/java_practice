package com.whiteflame.day07.d1;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        HashSet<Integer> red = new HashSet<>();
        Random r = new Random();
        while (red.size() < 6) {
            int num = r.nextInt(33) + 1;
            red.add(num);
        }
        int blue = r.nextInt(16) + 1;
        List<Integer> list = new ArrayList<>();
        for (Integer i : red) {
            list.add(i);
        }
        Collections.sort(list, (o1, o2) -> o1 - o2);
        System.out.println("红球是");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println("\n蓝球是");
        System.out.println(blue);
    }
}
