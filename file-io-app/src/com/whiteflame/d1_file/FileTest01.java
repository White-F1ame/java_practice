package com.whiteflame.d1_file;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        // 认识File类
        // 1. 创建一个File类的对象，用于指向本地硬盘中的文件
        File f = new File("E:\\书txt\\《消失的爱人》.txt");
        System.out.println("f.getName() = " + f.getName());
        System.out.println("f.length() = " + f.length());
        System.out.println("f.getAbsolutePath() = " + f.getAbsolutePath());

        // 2. 指向一个不存在的路径
        File f2 = new File("E:\\书txt\\《不存在的文件》.txt");
        // 创建文件
        System.out.println(f2.createNewFile());
    }
}
