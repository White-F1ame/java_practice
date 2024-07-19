package com.whiteflame.d1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test_collection1 {
    public static void main(String[] args) {
        //认识Collection接口
        Collection<String> coll = new ArrayList<>(); // 多态
        // 添加
        coll.add("雾雨魔理沙"); // 编译看左边，运行看右边，调用ArrayList的add方法
        coll.add("八云紫");
        coll.add("十六夜咲夜");
        coll.add("博丽灵梦");
        coll.add("藤原妹红");
        // 清除集合中的所有元素
        //coll.clear();
        // 判断集合是否包含某个元素
        boolean rs = coll.contains("八云紫");
        System.out.println(rs);
        // isEmpty()判断集合是否为空集合，如果集合没有任何元素则返回true
        System.out.println(coll.isEmpty());

        // 删除元素
        boolean rs2 = coll.remove("雾雨魔理沙");
        System.out.println("是否删除成功：" + rs2);

        // 获取集合中的元素个数
        System.out.println(coll.size());

        // 将集合转成数组
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(coll);
    }
}
