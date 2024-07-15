package com.whiteflame.d7_interface_studentsystem_demo;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();//定义集合保存信息
    //方案一
    //private StudentOperator studentOperator = new StudentOperatorImpl1();
    //方案二
    private StudentOperator studentOperator = new StudentOperatorImpl2();

    public StudentManager() {
        //加上一点数据
        Student s1 = new Student("雷军", '男', 98);
        Student s2 = new Student("马斯克", '男', 88);
        Student s3 = new Student("余承东", '男', 100);
        Student s4 = new Student("刘亦菲", '女', 99);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
    }

    //打印全班学生信息
    public void printStudentInfo() {
        //调用方法打印学生信息
        studentOperator.printStudentInfo(students);//调用实现类中的方法,传入集合
    }


    //打印全班学生的平均分
    public void printAvgScore() {
        //调用方法打印全班学生的平均分
        studentOperator.printAvgScore(students);
    }



}
