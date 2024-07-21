package com.whiteflame.d2_list;

import java.util.ArrayList;
import java.util.List;

public class Test_list01 {
    public static void main(String[] args) {
        //学会List的特有方法
        //1.学会创建一个List集合（多态
        List<String> list = new ArrayList<>(); // 多态
        // 添加
        list.add("雾雨魔理沙"); // 编译看左边，运行看右边，调用ArrayList的add方法
        list.add("八云紫");
        list.add("十六夜咲夜");
        list.add("博丽灵梦");
        list.add("藤原妹红");
        System.out.println(list);

        //2.list集合下特有的方法

        //add(index,元素)根据索引添加元素
        list.add(1,"琪露诺");
        System.out.println(list);

        //remove(索引)根据索引删除集合中的元素
        String removeElement = list.remove(4);
        System.out.println(removeElement);
        System.out.println(list);

        //set(index,element)修改指定索引处的元素，返回被修改的元素
        String name = list.set(1,"西行寺幽幽子");
        System.out.println(name);
        System.out.println(list);

        //get(index)根据索引获取元素
        System.out.println(list.get(3));

    }
}
