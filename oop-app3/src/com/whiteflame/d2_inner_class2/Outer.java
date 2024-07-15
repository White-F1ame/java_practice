package com.whiteflame.d2_inner_class2;

public class Outer {
    private int age = 18;//实例成员
    public static String school = "school";//类变量
    public static class Inner {
        private String name;
        public static int num;
        public void test(){
            //System.out.println(age);//不能直接访问外部类的实例成员
            System.out.println(school);
        }
    }
}
