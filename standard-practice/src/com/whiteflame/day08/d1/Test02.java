package com.whiteflame.day08.d1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * 给定一个字符串列表，请使用 `Stream` 对其进行以下处理：
 * <p>
 * - 过滤出所有长度小于`8`的字符串。
 * - 将所有字符串转换为**小写**。
 * - 去除所有**重复**的字符串。
 * - 对剩余的字符串按照字母顺序**自然排序**排列。
 * - 跳过前`2`个，取出`5`个。
 * - 通过 `forEach` 方法打印出所有字符串。
 */
public class Test02 {
    public static void main(String[] args) {
        String[] arr = {"aa1", "aa2", "ac3", "Zxc4",
                "gg5", "gg5", "qs6", "zxc7", "pl8", "sd911111111"};
        deal(arr);
    }

    public static void deal(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (String s : strArr) {
            list.add(s);
        }
        Stream<String> stream = list.stream();
        //过滤出所有长度小于8的字符串/转小写/去重/自然排序/跳2取5/遍历输出
        stream.filter(s -> s.length() < 8)
                .map((Function<String, Object>) string -> string.toLowerCase())
                .distinct().sorted().skip(2).limit(5)
                .forEach(System.out::println);
    }
}
