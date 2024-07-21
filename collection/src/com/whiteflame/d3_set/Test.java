package com.whiteflame.d3_set;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        double[] arr = {88.5, 39.2, 77.1, 56.8, 89.0, 99.0, 59.5};
        Collection<Double> list = new ArrayList<>();
        for (double v : arr) {
            list.add(v);
        }
        System.out.println("使用增强for遍历所有元素，并打印如下：");
        for (Double v : list) {
            System.out.println(v);
        }
        System.out.println("使用增强for遍历所有元素，打印不及格的分数如下：");
        int count = 0;
        BigDecimal sum = BigDecimal.valueOf(0);
        for (Double v : list) {
            if (v < 60) {
                System.out.println(v);
                count++;
                sum = sum.add(BigDecimal.valueOf(v));
            }
        }
        BigDecimal c = BigDecimal.valueOf(count);
        BigDecimal avg = sum.divide(c,3, RoundingMode.HALF_DOWN);
        double v = avg.doubleValue();
        System.out.println("不及格的分数有"+count+"个，不及格的人平均分是："+v);
        double max = Double.MIN_VALUE;
        for (Double num : list) {
            max = Math.max(max,num);
        }
        System.out.println("集合中的最大值是："+max);



/*        Collection<String> books = new ArrayList<>();
        books.add("JavaEE企业级开发指南");
        books.add("Oracle高级编程");
        books.add("MySQL从入门到精通");
        books.add("Java架构师之路");

        Iterator<String> it1 = books.iterator();
        System.out.println("---所有元素如下---");
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        Iterator<String> it2 = books.iterator();
        System.out.println("---书名小于10个字符的元素如下---");
        while (it2.hasNext()) {
            String next = it2.next();
            if (next.length() < 10) {
                System.out.println(next);
            }
        }

        Iterator<String> it3 = books.iterator();
        System.out.println("---书名中包含“Java”的元素如下---");
        while (it3.hasNext()) {
            String book = it3.next();
            if (book.contains("Java")) {
                System.out.println(book);
            }
        }

        Iterator<String> it4 = books.iterator();
        System.out.println("---删除“oracle”的元素如下---");
        while (it4.hasNext()){
            String book = it4.next();
            if (book.contains("Oracle")){
                it4.remove();
            }
        }
        System.out.println(books);*/

        //double[] arr = {2.2,5.5,6.6,2.2,8.8,1.1,2.2,8.8,5.5,2.2,6.6};
        //HashSet<Double> set = new HashSet<>();
        //for (double v : arr) {
        //    set.add(v);
        //}
        //System.out.println(set);


        /*List<String> list = new ArrayList();
        list.add("itheima");
        list.add("itcast");
        list.add(16);
        list.forEach(new Consumer() {
            @Override
            public void accept(Object s) {
                String e = (String) s;
                System.out.println(e.length());
            }
        });*/
    }
}
