package com.whiteflame.d1_collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test_collection_for {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("兰德里的折磨");
        c.add("峡谷制造者");
        c.add("收集者");

        for (String s : c) {
            System.out.println(s);
        }

        String[] strs = {"chatGPT", "通义千问", "文心一言"};
        for (String str : strs) {
            System.out.println(str);
        }
    }
}
