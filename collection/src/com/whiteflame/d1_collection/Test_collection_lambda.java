package com.whiteflame.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Test_collection_lambda {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("兰德里的折磨");
        c.add("峡谷制造者");
        c.add("收集者");
        System.out.println(c);

        //调用forEach遍历集合
        /*c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        // Lambda
        //c.forEach((s) -> System.out.println(s));
        //c.forEach(System.out::println);

        c.forEach((string) -> System.out.println(string));
    }
}
