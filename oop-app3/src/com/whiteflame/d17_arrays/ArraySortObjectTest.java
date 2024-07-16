package com.whiteflame.d17_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortObjectTest {
    public static void main(String[] args) {
        Student[] studentArr = new Student[4];
        Student stu1 = new Student("芙兰朵露", 118, 900.0);
        Student stu2 = new Student("蕾米莉亚", 128, 901.1);
        Student stu3 = new Student("十六夜咲夜", 18, 90.2);
        Student stu4 = new Student("帕秋莉", 50, 909.3);

        studentArr[0] = stu1;
        studentArr[1] = stu2;
        studentArr[2] = stu3;
        studentArr[3] = stu4;

        Arrays.sort(studentArr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(Arrays.toString(studentArr));

    }
}
