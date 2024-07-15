package com.whiteflame.d8_api_objects_integer;


import java.util.ArrayList;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        //Objects工具类
        String s1 = "博丽灵梦";
        String s2 = "博丽灵梦";
        String s3 = null;

        System.out.println("两对象用equals()"+s1.equals(s2));
        //空指针异常
        //System.out.println(s3.equals(s1));

        System.out.println("用Objects.equals()"+Objects.equals(s1, s3));

        System.out.println("isNull?"+Objects.isNull(s3));//true
        System.out.println(s3 == null);

        System.out.println("nonNull?"+Objects.nonNull(s3));//false

        System.out.println("-------------");

        //包装类
        int num = 10;

        //构造方法,过时
        Integer i = new Integer(num);
        System.out.println("用构造方法创建包装类对象，已过时:" + i);

        //valuerof
        Integer i2 = Integer.valueOf(num);
        System.out.println("valueof:" + i2);

        //自动装箱机制
        Integer i3 = 20;
        System.out.println("自动装箱机制:" + i3);

        //自动拆箱机制
        int i4 = i3;
        System.out.println("自动拆箱机制:" + i4);

        System.out.println("-------------");

        //集合的泛型里面不支持使用基本数据类型，可以用包装类
        //ArrayList<int> list = new ArrayList<int>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        //利用自动拆箱
        int i5 = list.get(0);
        int i6 = list.get(1);

        System.out.println("利用自动拆箱把Integer对象直接传入int型变量：" + i5);
        System.out.println("利用自动拆箱把Integer对象直接传入int型变量：" + i6);

        System.out.println("------包装类的常见操作：将基本数据类型转换成字符串-------");

        //包装类的常见操作：将基本数据类型转换成字符串
        Integer j1 = 20;
        String str1 = Integer.toString(j1);
        System.out.println("str+10="+str1+10);

        //将字符串数值转换成对应的基本数据类型
        String changeStr = "18";
        //方法一
        System.out.println("------方法一-------");
        int number = Integer.parseInt(changeStr);
        System.out.println(1+number+"= 1 + 18");

        //方法二
        System.out.println("------方法二-------");
        int number2 = Integer.valueOf(changeStr);
        System.out.println(1+number2+"= 1 + 18");

    }
}
