package com.whiteflame.d4_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test03 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("芙兰朵露","红魔馆");
        map.put("蕾米莉亚","红魔馆");
        map.put("博丽灵梦","博丽神社");
        map.put("八意永琳","月球");
        map.put("魂魄妖梦","三途川");
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = map.get(key);
            System.out.println(key + " --> " + value);
        }
    }
}
