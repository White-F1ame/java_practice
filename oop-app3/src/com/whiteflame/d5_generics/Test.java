package com.whiteflame.d5_generics;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        //list.add('a');

        MyArrayLis<String> lis = new MyArrayLis<>();
        MyArrayList<String, Float> list1 =new MyArrayList<>();
        list1.add("aa",15.0F);
    }
}
