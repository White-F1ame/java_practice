package com.whiteflame.d2_list;

import java.util.LinkedList;

public class Test_linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("good");
        list.add("morning");
        list.add("America");
        list.addFirst("you");
        list.addFirst("fuck");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(list);

        //void add(int index, E element) 将指定元素插入此列表中的指定位置
        list.add(2,"too");
        System.out.println(list);

        // boolean add(E e) 将指定的元素追加到此列表的末尾
        list.add("Apple");

        // boolean addAll(int index, Collection<? extends E> c) 从指定位置开始，将指定集合中的所有元素balbala不想写了





    }
}
