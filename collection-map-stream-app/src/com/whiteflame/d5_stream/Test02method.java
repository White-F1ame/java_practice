package com.whiteflame.d5_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test02method {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "芙兰朵露", "八云紫", "蕾米莉亚", "博丽灵梦", "八云蓝", "八意永琳", "魂魄妖梦", "八云红");


        //Stream<String> stream1 = list.stream().filter(s -> s.startsWith("八云"));

        //stream1.forEach(string -> System.out.println(string));

        //获取前面3个元素
        Stream stream1 = list.stream().limit(2);

        //跳过前三个元素
        Stream stream2 = list.stream().skip(3);

        System.out.println("---");
        //合并流
        Stream stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(s -> System.out.println(s));

        System.out.println("---");

        //排序
        List<Integer> numlist = new ArrayList<>();
        Collections.addAll(numlist, 3, 2, 1, 6, 5, 7);
        numlist.stream().sorted().forEach(System.out::println);

        List<Student> studentList = new ArrayList<>();
        Student stu1 = new Student("芙兰朵露", 12);
        Student stu2 = new Student("八云紫", 10);
        Student stu3 = new Student("蕾米莉亚", 22);
        Student stu4 = new Student("博丽灵梦", 29);

        Collections.addAll(studentList, stu1, stu2, stu3, stu4);

        studentList.stream().sorted(Comparator.comparingInt(Student::getAge)).forEach(System.out::println);

        //去重
        list.add("博丽灵梦");
        System.out.println(list);
        list.stream().distinct().forEach(System.out::println);


    }
}

class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }
}
