package com.whiteflame.day07.d2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String,String> students1 = new HashMap<>();
        HashMap<String,String> students2 = new HashMap<>();
        students1.put("001","李晨");
        students1.put("002","范冰冰");
        students2.put("001","马云");
        students2.put("002","马化腾");
        HashMap<String,HashMap<String,String>> map = new HashMap<>();
        map.put("Java基础班",students1);
        map.put("Java就业班",students2);

        Set<String> strs = map.keySet();
        for (String str : strs) {
            Set<String> strings = map.get(str).keySet();
            System.out.println(str+":");
            for (String s : strings) {
                System.out.println(s+"\t"+map.get(str).get(s));
            }
        }

    }
}
