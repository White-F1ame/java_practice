package com.whiteflame.d18_lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Test03 {
    public static void main(String[] args) {
        String[] guys = {"Knowledge", "Flandaw", "PadMaid", "Saki", "azuki", "kuruto", "dodoro"};

        /*
        Arrays.sort(guys, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
         */

        // 简化为：
        //Arrays.sort(guys, (o1, o2) -> o1.compareToIgnoreCase(o2));

        // 用特定类型方法引用简化为：
        Arrays.sort(guys, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(guys));


    }
}
