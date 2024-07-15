package com.whiteflame.d5_abstract_template_method_employee;

public abstract class Employee {
    private String name;
    private int age;

    public final void info(){
        System.out.println("姓名：");
        System.out.println(getName());
        System.out.println("年龄：");
        System.out.println(getAge());
        personalInfo();
    }
    public abstract String personalInfo();
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
}
