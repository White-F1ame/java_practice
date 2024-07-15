package com.whiteflame.d10_api_stringjoiner;

import java.util.StringJoiner;

public class Demo01 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ");
        sj.add("博丽灵梦");
        sj.add("雾雨魔理沙");
        sj.add("八云紫");
        System.out.println(sj);

        StringJoiner sj2 = new StringJoiner(", ", "红魔馆：[", "]");
        sj2.add("十六夜咲夜");
        sj2.add("芙兰朵露");
        sj2.add("帕秋莉·诺蕾姬");
        System.out.println(sj2);

        String[] str = new String[]{"琪露诺","八云蓝","蓬莱山辉夜"};
        System.out.println(getArrayInfo(str));

    }

    //返回数组改造
    public static String getArrayInfo(String[] arr) {
        if (arr == null) {
            return null;
        }
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i]);
        }

        return sj.toString();
    }
}
