package com.whiteflame.d8_extends;

public class Test {
    public static void main(String[] args) {
        //继承的使用
        Teacher teacher = new Teacher();
        teacher.setName("老王");
        teacher.setSkill("Java");
        System.out.println("teacher.getName() = " + teacher.getName());
        System.out.println("teacher.getSkill() = " + teacher.getSkill());
        teacher.info();
    }
}
