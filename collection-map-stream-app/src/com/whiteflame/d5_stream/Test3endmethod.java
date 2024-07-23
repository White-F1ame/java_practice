package com.whiteflame.d5_stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3endmethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 11, 22, 33,44);
        Map<Integer,String> map = new HashMap<>();
        for (Integer i : list) {
            map.put(i,"呵呵");
        }
        Optional<Integer> max = list.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(max.get());

        Optional<Integer> min = list.stream().min((o1, o2) -> o1-o2);
        System.out.println(min.get());

        //收集流
        //->collection
        List<Integer> collect1 = list.stream().limit(3).collect(Collectors.toList());
        //->arr
        Object[] collect2 = list.stream().limit(3).toArray();

        //Collections中的收集方法
        //收集list
        List<Integer> clist = list.stream().limit(3).collect(Collectors.toList());
        System.out.println(clist);

        //收集set
        Set<Integer> cset = list.stream().limit(3).collect(Collectors.toSet());
        System.out.println(cset);

        //收集map
        List<Student> studentList = new ArrayList<>();
        Student stu1 = new Student("芙兰朵露", 12);
        Student stu2 = new Student("八云紫", 10);
        Student stu3 = new Student("蕾米莉亚", 22);
        Student stu4 = new Student("博丽灵梦", 29);
        Collections.addAll(studentList, stu1, stu2, stu3, stu4);
        Map<String, Integer> cmap = studentList.stream()
                .limit(3)
                .filter(s->s.getAge()>10)
                .collect(Collectors.toMap(student -> student.getName(), student -> student.getAge()));
        System.out.println(cmap);

    }
}
