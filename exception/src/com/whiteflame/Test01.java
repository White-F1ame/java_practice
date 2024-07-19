package com.whiteflame;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        String name = null;
        //name.length();//NullPointerException
        int[] a = {};
        for (int i = 0; i < 1; i++) {
            //System.out.println(a[i]);//ArrayIndexOutOfBoundsException
        }
        Scanner scanner = new Scanner(System.in);
        //double b = scanner.nextDouble();//InputMismatchException
    }
}
