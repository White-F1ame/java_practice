package com.whiteflame.day07;

import java.util.HashMap;
import java.util.HashSet;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test01 {
    public static void main(String[] args) {
        //Map存储搜索类别和搜索条件
        HashMap<String, HashSet<String>> search = new HashMap<>();
        //Set存储搜索条件
        HashSet<String> bands = new HashSet<>();
        bands.add("电子工业出版社");
        bands.add("异步图书");
        bands.add("清华大学出版社");

        HashSet<String> releaseDate = new HashSet<>();
        releaseDate.add("往季");
        releaseDate.add("2019年春季");
        releaseDate.add("2019年冬季");

        HashSet<String> object = new HashSet<>();
        object.add("编程语言与程序设计");
        object.add("网络与通讯");
        object.add("数据库");

        search.put("品牌", bands);
        search.put("上市时间", releaseDate);
        search.put("计算机与互联网", object);

        search.forEach((key, values) -> {
            System.out.print(key + ":");
            values.forEach(new Consumer<String>() {
                @Override
                public void accept(String string) {
                    System.out.print(string);
                    System.out.print(" ");
                }
            });
            System.out.println();
        });
    }
}
