package com.whiteflame.d5_stream;

import java.util.*;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷诺","赵敏","张强","张三丰");

        /*List<String> newList = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")&&s.length()==3){
                newList.add(s);
            }
        }
        System.out.println(newList);*/

        //获取集合的Stream流
        Stream<String> s1 = list.stream();

        Set<String> set = new HashSet<>();
        Collections.addAll(set,"张无忌","周芷诺","赵敏","张强","张三丰");
        Stream<String> s2 = set.stream();

        //获取数组的stream流
        String[] arr ={"张无忌","周芷诺","赵敏","张强","张三丰"};
        // 方法一，Arrays.stream(数组)
        Stream<String> s3 = Arrays.stream(arr);
        // 方法二，Stream.of(可变参数)
        Stream<String> s4 = Stream.of("张无忌","周芷诺","赵敏","张强","张三丰");
        //  获取双列集合的steam流
        Map<String,String> map = new HashMap<>();
        map.put("李斌","蔚来");
        map.put("何小鹏","小鹏");
        map.put("理想","理想");
        // 按键获取
        Set<String> keys = map.keySet();
        keys.stream();
        // 按值获取
        //Collection<String> values =

    }
}
