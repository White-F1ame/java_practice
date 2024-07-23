package com.whiteflame.day08.d1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入文件路径：");
        String url = sc.nextLine();
        File file = new File(url);

        if (!file.exists()) {
            file.createNewFile();
        } else if (file.isFile()) {
            System.out.println(file.length());
        }
    }
}
