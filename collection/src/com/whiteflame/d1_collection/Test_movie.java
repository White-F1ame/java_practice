package com.whiteflame.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Test_movie {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        Movie m1 = new Movie("尖峰时刻", 9.1, "成龙");
        Movie m2 = new Movie("宝贝计划", 9.1, "刘德华");
        Movie m3 = new Movie("一代宗师", 9.1, "梁朝伟");

        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        //三种遍历方式

        //普通for
        //略

        System.out.println();
        //迭代器
        Iterator<Movie> it = movies.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();
        //增强for
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        System.out.println();
        //Lambda简化
        movies.forEach((movie) -> System.out.println(movie));
    }
}
