package com.whiteflame.d1_file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileMethod05 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("file-io-app/src/com/whiteflame/d1_file/waste.txt");
        //创建文件功能
        //创建一个新的空的文件
        f1.createNewFile();
        //只能创建一级文件夹
        File f2 = new File("file-io-app/src/com/whiteflame/d1_file/waste");
        //可以创建多级文件夹
        File f3 = new File("file-io-app/src/com/whiteflame/d1_file/waste/1/2/3");
        f3.mkdirs();

        //File类删除文件功能delete，默认只能删除文件和空文件，删除后不会进回收站，无法复原
        //文件夹内有文件或文件夹时无法删除
        File f4 = new File("file-io-app/src/com/whiteflame/d1_file/waste");
        f4.delete();
        File f5 = new File("file-io-app/src/com/whiteflame/d1_file/waste/1/2/3");
        f5.delete();

        File books = new File("E:\\书txt");
        //遍历1
        String[] arr = books.list();
        System.out.println(Arrays.toString(arr));
        //遍历2
        File[] list = books.listFiles();
        for (File file : list) {
            System.out.println(file);
        }

    }
}
