package com.whiteflame.day05.d1_arrays;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {
        int[] array = {11, 55, 33, 44, 66, 88, 77};
        // 从索引1到索引5拷贝一个新数组
        int[] arrayCopy = Arrays.copyOfRange(array, 1, 5);
        // 对新数组进行排序
        Arrays.sort(arrayCopy);
        // 最后将结果输出
        System.out.println(Arrays.toString(arrayCopy));
    }
}
