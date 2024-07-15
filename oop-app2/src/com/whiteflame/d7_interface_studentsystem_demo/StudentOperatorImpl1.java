package com.whiteflame.d7_interface_studentsystem_demo;

import java.util.ArrayList;

public class StudentOperatorImpl1 implements StudentOperator {
    @Override
    public void printStudentInfo(ArrayList<Student> students) {
        System.out.println("--------全部信息如下--------");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名：" + s.getName() + "，性别：" + s.getSex() + "，成绩：" + s.getScore());
        }
    }

    @Override
    public void printAvgScore(ArrayList<Student> students) {
        double allScore = 0.0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            allScore += s.getScore();
        }
        System.out.println("avg = " + (allScore / students.size()));

    }
}
