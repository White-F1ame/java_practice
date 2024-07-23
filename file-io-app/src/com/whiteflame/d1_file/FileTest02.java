package com.whiteflame.d1_file;

import java.io.File;

public class FileTest02 {
    public static void main(String[] args) {
        //1.常规
        //File f1 = new File("E:\\书txt\\《消失的爱人》.txt");

        //2.File(父路径,子路径)
        /*File f2 = new File("E:\\书txt","《消失的爱人》.txt");
        System.out.println(f2);*/

        //3.File(File对象,子路径)
        File f3 = new File("E:\\书txt");
        File f4 = new File(f3,"哲学");
        File f5 = new File(f3,"轻小说\\日式轻小说");

        //创建出单层级的文件夹
        System.out.println(f4.mkdir());
        //创建出多层级的文件夹
        System.out.println(f5.mkdirs());
    }
}
