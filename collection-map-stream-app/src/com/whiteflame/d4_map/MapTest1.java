package com.whiteflame.d4_map;

import com.sun.source.doctree.SeeTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
    public static void main(String[] args) {
        //学习使用Map集合及常用方法
        Map<String, String> map = new HashMap<>();// 常见

        // 1. 添加元素put(键,值)
        map.put("余承东","清华大学");
        map.put("雷军","武汉大学");
        map.put("马斯克","哈佛大学");
        // 如果存储的键是重复的，那么值就会覆盖之前的值
        map.put("余承东","西北工业大学");
        map.put("扎克伯格","哈佛大学");// 无序，不重复，无索引

        System.out.println(map);

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(1,"余承东");
        map2.put(2,"雷军");
        map2.put(3,"马化腾");
        map2.put(4,"中青宝");

        // 获取Map集合的大小 size()
        System.out.println(map.size());
        // 清空集合 clear()
        //System.out.map2.                []

        // 7.1
        // 8. 判断是否包含值
        System.out.println(map.containsKey("清华大学"));

        // 9. 获取键的集合（遍历map集合用到）
        Set<String> set = map.keySet();
        System.out.println(set);
        //for (String key : set) {
        //    System.out.println(key+ "-->"+set.get());
        //}
        //困了，不写了
    }
}