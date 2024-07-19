package com.whiteflame.day01.practice02;

import com.whiteflame.day01.practice02.util.MyArrays;

public class Test {
    /**
     * > 目标：通过练习，能够说出static修饰方法的使用场景，掌握工具类的定义流程<p>
     * 1.需求<p>
     * 定义一个工具类MyArrays，要求类中实现：<p>
     * 1.定义一个方法getMax(int[] arr)，可以接受一个整数数组，方法中实现获取数组的最大值并且返回.<p>
     * 2.定义一个方法toString(int[] arr),可以接受一个整数数组，方法中实现把数组的内容拼接成一个字符串，并且返回。格式如：
     *   [11, 22, 33, 44]<p>
     *
     * 2.技术点说明<p>
     *工具类的定义<p>
     * static修饰方法<p>
     *
     * 3.思路分析<p>
     * 1.先定义一个类MyArrays<p>
     * 2.按照工具类的定义的流程，需要私有构造器<p>
     * 3.定义静态方法getMax(int[] arr)<p>
     * 4.定义静态方法toString(int[] arr)<p>
     */
    public static void main(String[] args) {
        int[] arr = {11,22,33};

        System.out.println(MyArrays.getMax(arr));
        System.out.println(MyArrays.toString(arr));
    }
}
