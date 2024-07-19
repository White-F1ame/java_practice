package com.whiteflame.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test_collection_iterator {
    public static void main(String[] args) {
/*        //1.先创建一个集合对象
        Collection<String> c = new ArrayList<>();
        c.add("兰德里的折磨");
        c.add("峡谷制造者");
        c.add("收集者");
        System.out.println(c);

        //2.通过集合对象名.iterator()获取到迭代器对象
        Iterator<String> it = c.iterator();

        //System.out.println(it.next());

        //3.通过循环使用迭代器遍历
        while (it.hasNext()){
            System.out.println(it.next());
        }*/


        Collection<Character> c = new ArrayList<>();
        c.add('a');
        c.add('b');
        c.add('c');
        System.out.println(c);
        Iterator<Character> it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
