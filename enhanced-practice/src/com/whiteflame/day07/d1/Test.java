package com.whiteflame.day07.d1;

import java.math.BigDecimal;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1,"哥哥",61.5);
        Student s2 = new Student(2,"飞蝗",100);
        Student s3 = new Student(3,"小澡",98);
        Student s4 = new Student(4,"噗噗",98.5);

        List<Student> students = new ArrayList<>(/*(o1, o2) -> Double.compare(o1.getScore(), o2.getScore())*/);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        Collections.sort(students, (o1, o2) -> Double.compare(o1.getScore(), o2.getScore()));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
