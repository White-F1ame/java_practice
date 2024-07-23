package com.whiteflame.day07.d2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Test1 {
    public static void main(String[] args) {
        List<String> goodsList = new ArrayList<>();
        goodsList.add("小浣熊");
        goodsList.add("香蕉");
        goodsList.add("苹果");
        goodsList.add("口香糖");
        goodsList.add("蟹黄");

        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品名称，每行输入一个，以end结束");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("end")) break;
            if (map.get(input) == null) {
                map.put(input, 1);
            } else {
                map.put(input,map.get(input)+1);
            }
        }
        map.forEach((s, values) -> System.out.println(s+"售出数量:"+values));
    }
}
