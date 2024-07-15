package com.whiteflame.d11_api_system;

public class Demo01 {
    public static void main(String[] args) {

        //System.exit(0);
        long start = System.currentTimeMillis();
        //System.out.println(start);
        for (int i = 0; i < 10000000; i++) {
            System.out.println("i="+i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
