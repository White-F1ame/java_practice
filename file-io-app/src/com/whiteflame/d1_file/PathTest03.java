package com.whiteflame.d1_file;

import java.io.File;
import java.io.IOException;

public class PathTest03 {
    public static void main(String[] args) throws IOException {
        // 绝对路径
        File f = new File("E:\\Books");
        // 相对路径
        File f2 = new File("file-io-app/src/aa.txt");
        System.out.println(f2.exists());
        System.out.println(f2.length());


        File f3 = new File("file-io-app/src/com/whiteflame/Test.txt");
        f3.createNewFile();
    }
}
