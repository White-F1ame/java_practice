package com.whiteflame.d20_search;

import com.whiteflame.d19_sort.Sort;

public class Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(halfSearch(arr, 1));
    }

    /**
     * 折半查找法，需要传入一个有序数组
     *
     * @param arr
     * @param value
     * @return
     */
    public static int halfSearch(int[] arr, int value) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end) {
            int half = begin + (end - begin) / 2;
            if (value > arr[half]) {
                begin = half;
            } else if (value < arr[half]) {
                end = half;
            } else {
                return half;
            }
        }
        //没找到value
        return -1;
    }
}
