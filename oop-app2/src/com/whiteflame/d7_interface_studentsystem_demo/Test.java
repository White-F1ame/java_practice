package com.whiteflame.d7_interface_studentsystem_demo;

import com.whiteflame.d6_interface.A;

import java.util.ArrayList;

public class Test {

    static ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) {
        Student s1 = new Student("雷军", '男', 98);
        Student s2 = new Student("马斯克", '男', 88);
        Student s3 = new Student("余承东", '男', 100);
        Student s4 = new Student("刘亦菲", '女', 99);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        printStudentInfo();
        printAvgScore();

        printStudentInfo2();
        printAvgScore2();

    }

    //plan A
    //all info
    public static void printStudentInfo() {
        System.out.println("--------全部信息如下--------");
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println("姓名：" + s.getName() + "，性别：" + s.getSex() + "，成绩：" + s.getScore());
        }
    }

    //avg
    public static void printAvgScore() {
        double allScore = 0.0;
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            allScore += s.getScore();
        }
        System.out.println("avg = " + (allScore / list.size()));
    }

    //plan B
    //all info and count ever gender
    public static void printStudentInfo2() {
        System.out.println("--------全部信息如下--------");
        int man = 0;
        int female = 0;
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println("姓名：" + s.getName() + "，性别：" + s.getSex() + "，成绩：" + s.getScore());
            if (s.getSex() == '男') {
                man++;
            } else {
                female++;
            }
        }
        System.out.println("man:" + man + ",female:" + female);
        System.out.println("------------------");
    }

    //avg
    public static void printAvgScore2() {
        double allScore = 0.0;
        double max = list.get(0).getScore();
        double min = list.get(0).getScore();
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            allScore += s.getScore();
            max = Math.max(max, list.get(i).getScore());
            min = Math.min(min, list.get(i).getScore());
        }
        System.out.println("max = " + max + ", min = " + min);
        System.out.println("avg = " + ((allScore - max - min) / (list.size() - 2)));
    }


}
