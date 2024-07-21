package com.whiteflame.d4_map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Test4 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("芙兰朵露","红魔馆");
        map.put("蕾米莉亚","红魔馆");
        map.put("博丽灵梦","博丽神社");
        map.put("八意永琳","月球");
        map.put("魂魄妖梦","三途川");
        //原式
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String k, String v) {
                System.out.println(k + " --> " + v);
            }
        });

        //lambda
        map.forEach((k, v) -> System.out.println(k + " --> " + v));
    }
}
