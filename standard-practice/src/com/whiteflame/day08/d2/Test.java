package com.whiteflame.day08.d2;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //E:\书txt\刘慈欣科幻小说合集
        //4.54 MB (4,766,647 字节)
        Scanner sc = new Scanner(System.in);
        System.out.println("输入路径");
        String url = sc.nextLine();
        count(url);
        System.out.println("共"+num+"KB");
    }

    public static int num = 0;

    public static void count(String url) {
        File file = new File(url);
        File[] files = file.listFiles();
        if (files == null) {
            System.out.println(0);
            return;
        }
        for (File f : files) {
            if (f.exists()) {
                if (f.isFile()){
                    num+=f.length();
                }else {
                    count(f.getAbsolutePath());
                }
            }
        }
    }
}
