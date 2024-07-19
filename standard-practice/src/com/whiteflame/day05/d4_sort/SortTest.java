package com.whiteflame.day05.d4_sort;

import java.util.Arrays;
import java.util.Random;

public class SortTest {
    public static void main(String[] args) {
        int[] array = new int[6];
        randomValueToArray(array, 1, 100);
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 冒泡排序
     * @param array
     */
    public static void bubbleSort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    /**
     * 给数组填满随机值
     * @param array
     * @param start
     * @param end
     */
    public static void randomValueToArray(int[] array, int start, int end) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(end + 1) + start;
        }
    }
}
