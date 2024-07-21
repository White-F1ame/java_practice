package com.whiteflame.d2_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test_list02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // 多态
        list.add("雾雨魔理沙");
        list.add("八云紫");
        list.add("十六夜咲夜");
        list.add("博丽灵梦");
        list.add("藤原妹红");
        //System.out.println(list);

        //for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        //迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            //list.add("aaa");不可以add和remove在迭代器里
        }
        System.out.println();


        //增强for
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();

        //lambda
        list.forEach((e) -> System.out.println(e));
    }
}
