package com.whiteflame.d3_set;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
    public static void main(String[] args) {
        // 学会使用set集合

        // 1.创建一个HashSet集合对象
        HashSet<String> set = new HashSet<>();

        // 2.使用set集合添加元素
        System.out.println("不能存储重复的元素");
        set.add("A");
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("D");

        System.out.println(set);

        // 3.删除元素
        System.out.println(set.remove("A"));
        System.out.println(set);

        // 4.清空集合元素
        //set.clear();
        System.out.println(set);

        // 5.iterator 获取迭代器对象遍历set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
