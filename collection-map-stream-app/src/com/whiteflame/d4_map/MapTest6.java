package com.whiteflame.d4_map;

import java.util.*;

public class MapTest6 {
    public static void main(String[] args) {
        //集合的嵌套
/*        Map<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> citys1 = new ArrayList<>();
        ArrayList<String> citys2 = new ArrayList<>();
        Collections.addAll(citys1,"福州市","三明市","厦门市");
        Collections.addAll(citys2,"深圳市","中山市","广州市");

        map.put("福建省",citys1);
        map.put("广东省",citys2);
        System.out.println(map);*/
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("aaa");
        list.add("ccc");
        list.add("cba");
        list.add("cb");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

//输出集合
        System.out.println(list);
    }
}
