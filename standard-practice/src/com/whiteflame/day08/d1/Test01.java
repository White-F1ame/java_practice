package com.whiteflame.day08.d1;

import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        /*Stream中有如下7个元素：黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，
        请获取郭字开头的前2个元素并打印。
        数据如下:
        Stream<String> original = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");*/
        Stream<String> original = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");
        original.filter(s -> s.startsWith("郭")).limit(2).forEach(System.out::println);

    }
}
