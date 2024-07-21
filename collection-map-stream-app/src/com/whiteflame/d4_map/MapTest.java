package com.whiteflame.d4_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("芙兰朵露","红魔馆");
        map.put("蕾米莉亚","红魔馆");
        map.put("博丽灵梦","博丽神社");
        map.put("八意永琳","月球");
        map.put("魂魄妖梦","三途川");
        // 1、获取Map集合的全部键
        Set<String> keys = map.keySet();
        for (String key : keys) {
            // 根据键获取对应的值
            String value = map.get(key);
            System.out.println(key + "=-->" + value);
        }
    }
}
