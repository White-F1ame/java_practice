package com.whiteflame.day07;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiConsumer;

public class Test04 {
    public static void main(String[] args) {
        //TreeMap 特点 用哈希表+链表+红黑树实现，键按从小到大排序，键不可重复，键无索引
        //键：劳模对象； 值：家庭住址
        TreeMap<Labor, String> guys = new TreeMap<>();
        Labor l1 = new Labor("张三", 18);
        Labor l2 = new Labor("李四", 20);
        guys.put(l1, "北京");
        guys.put(l2, "上海");
        guys.put(new Labor("王五", 35), "天津");
        guys.put(new Labor("赵六", 21), "北京");
        guys.put(new Labor("田七", 19), "上海");

        //删除张三
        guys.remove(l1);
        //修改李四地址为郑州
        guys.replace(l2,"郑州");
        Set<Labor> laborSet = guys.keySet();

        System.out.println("方式1遍历\t\t键找值");
        for (Labor labor : laborSet) {
            String v = guys.get(labor);
            System.out.println(labor + "--" + v);
        }
        System.out.println("============");
        System.out.println("方式2遍历\t\t键值对对象");
        Set<Map.Entry<Labor,String>> entries = guys.entrySet();
        for (Map.Entry<Labor, String> entry : entries) {
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }
        System.out.println("============");
        System.out.println("方式2遍历\t\t接口中默认的forEach");
        guys.forEach((labor, address) -> System.out.println(labor+"--"+address));

    }
}
