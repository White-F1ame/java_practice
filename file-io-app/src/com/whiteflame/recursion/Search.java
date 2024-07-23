package com.whiteflame.recursion;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Search {
    public static void main(String[] args) throws IOException {
        //File dir = new File("E:/");
        //findFile(dir);
        find("《不存在的文件》.txt", "E:/书txt");
    }

    public static void findFile(File dir, String target) throws IOException {
        //判断传入的路径是否存在，是否为空，判断是否是文件
        if (dir == null || !dir.exists() || dir.isFile()) {
            return;
        }
        //开始获取该路径下的所有文件，逐个判断时文件还是文件夹
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    if (file.getName().contains(target)) {
                        System.out.println(target + "的位置在：" + file.getAbsolutePath());
                        Desktop desktop = Desktop.getDesktop();
                        desktop.open(file);
                        //Runtime r = Runtime.getRuntime();
                        //r.exec(file.getAbsolutePath());
                    }
                } else {
                    //如果是文件
                    findFile(file, target);
                }
            }
        }
    }

    public static void find(String target, String path) throws IOException {
        File dir = new File(path);
        findFile(dir, target);
    }
}
