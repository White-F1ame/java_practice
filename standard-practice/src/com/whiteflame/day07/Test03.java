package com.whiteflame.day07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test03 {
    public static void main(String[] args) {
        HashMap<Integer, String> stores = new HashMap<>();
        stores.put(101, "阿三面馆");
        stores.put(102, "阿四粥馆");
        stores.put(103, "阿五米馆");
        stores.put(104, "阿六快递");

        System.out.println("方式1遍历 键找值");
        Set<Integer> keys = stores.keySet();
        for (Integer key : keys) {
            System.out.println(key + "--" + stores.get(key));
        }
        System.out.println("====================");

        System.out.println("方式2遍历 键值对对象");
        Set<Map.Entry<Integer, String>> entries = stores.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
        System.out.println("====================");

        System.out.println("方式3遍历 接口中默认的forEach方法配合Lambda表达式");
        stores.forEach((k, v) -> System.out.println(k + "--" + v));

    }
}
