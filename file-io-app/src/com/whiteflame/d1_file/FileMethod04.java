package com.whiteflame.d1_file;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileMethod04 {
    public static void main(String[] args) {
        // 文件是否存在
        File f1 = new File("file-io-app/src/com/whiteflame/d1_file/FileTest01.java");
        System.out.println("f1.exists() = " + f1.exists());

        //是否是文件
        System.out.println("f1.isFile() = " + f1.isFile());

        //是否是文件夹
        System.out.println("f1.isDirectory() = " + f1.isDirectory());

        //文件名
        System.out.println("f1.getName() = " + f1.getName());

        //文件字节长度
        System.out.println("f1.length() = " + f1.length());

        //文件最后修改时间
        System.out.println("f1.lastModified() = " + f1.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("sdf.format(f1.lastModified()) = " + sdf.format(f1.lastModified()));

        //文件绝对路径
        System.out.println("f1.isAbsolute() = " + f1.isAbsolute());
    }
}
