package com.whiteflame.d4_map;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        // 创建集合存储学生投票
        List<String> list = new ArrayList<>();
        // 定义数组保存投票选项
        String[] arr = {"A", "B", "C", "D"};
        // 随便整80个数据放进投票集合list中
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int num = r.nextInt(arr.length);
            list.add(arr[num]);
        }
        // 创建映射存储投票选项和票数
        Map<String, Integer> map = new HashMap<>();
        // 遍历投票集合list中的每个元素
        for (String place : list) {
            // 判断映射中是否存在键与list此时遍历到的元素相同
            if (map.containsKey(place)) {
                // 如果存在，值增加
                Integer value = map.get(place);
                map.put(place, value + 1);
            } else {
                // 如果不存在，创建新的键值对
                map.put(place, 1);
            }
        }
        System.out.println(map);
    }
}
