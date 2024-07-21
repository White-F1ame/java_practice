package com.whiteflame.d1_parameter;

import java.util.Arrays;

public class ParamTest {
    public static void main(String[] args) {
        test();
        test(1);
        test(1,2);
        test(new int[]{1,2,3,4});
    }
    public static void test(int...nums){
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("===============");
    }
}
