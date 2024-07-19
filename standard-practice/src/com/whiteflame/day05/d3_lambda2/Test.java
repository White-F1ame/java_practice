package com.whiteflame.day05.d3_lambda2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Employee em1 = new Employee("张三", 23, 1000.0);
        Employee em2 = new Employee("王五", 25, 3000.0);
        Employee em3 = new Employee("李四", 24, 4000.0);
        Employee em4 = new Employee("赵六", 26, 6000.0);

        Employee[] employees = {em1, em2, em3, em4};

        Arrays.sort(employees, (o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()));
        System.out.println(Arrays.toString(employees));
    }
}
