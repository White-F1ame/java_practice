package com.whiteflame.d7_interface_studentsystem_demo;

import java.util.ArrayList;

public class StudentOperatorImpl2 implements StudentOperator {
    @Override
    public void printStudentInfo(ArrayList<Student> students) {
        System.out.println("--------全部信息如下--------");
        int man = 0;
        int female = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
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

    @Override
    public void printAvgScore(ArrayList<Student> students) {
        double allScore = 0.0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            allScore += s.getScore();
            max = Math.max(max, students.get(i).getScore());
            min = Math.min(min, students.get(i).getScore());
        }
        System.out.println("max = " + max + ", min = " + min);
        System.out.println("avg = " + ((allScore - max - min) / (students.size() - 2)));
    }
}
