package com.whiteflame.day08.d1;

import java.io.File;

public class Test04 {
    public static void main(String[] args) {
        String url = "E:\\书txt";
        search(url);
    }
    public static void search(String url){
        File file = new File(url);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()){
                System.out.println(f.getAbsolutePath());
            }else {
                search(f.getAbsolutePath());
            }
        }
    }
}