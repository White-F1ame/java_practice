package com.whiteflame.d19_sort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 3, 4, 2};
        System.out.println(Arrays.toString(arr));

        //bubbleSortUp(arr, "up");
        //bubbleSortUp(arr, "down");
        //selectSort(arr, "up");
        selectSort(arr, "down");
        System.out.println(Arrays.toString(arr));


    }

    //冒泡排序（升序）
    public static void bubbleSortUp(int[] arr, String style) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (style.equals("up")) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr, j, j + 1);
                    }
                } else if (style.equals("down")) {
                    if (arr[j] < arr[j + 1]) {
                        swap(arr, j, j + 1);
                    }
                }
            }
        }
    }

    //选择排序
    public static void selectSort(int[] arr, String style) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (style.equals("up")) {
                    if (arr[i] > arr[j]) {
                        swap(arr, i, j);
                    }
                } else if (style.equals("down")) {
                    if (arr[i] < arr[j]) {
                        swap(arr, i, j);
                    }
                }
            }
        }
    }

    // 交换整型数组中两个元素的位置
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
