package com.whiteflame.d9_api_stringbuilder;

/**
 * 设计一个方法，用于返回任意整型数组的内容，要求返回的数组内容格式如：[11,22,33]
 */
public class Demo03 {
    public static void main(String[] args) {
        //int[] arr = new int[]{11, 22, 33};
        int[] arr = new int[]{};
        //int[] arr = null;
        System.out.println(getArrayInfo(arr));

    }

    //返回数组
    public static String getArrayInfo(int[] arr) {
        if (arr == null){
            return null;
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(", ");
            } else {

            }
        }
        sb.append("]");
        return sb.toString();
    }
}
