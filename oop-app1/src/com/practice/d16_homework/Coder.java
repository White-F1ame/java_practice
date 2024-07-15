package com.practice.d16_homework;

public class Coder extends Employee {
    public Coder() {
    }

    public Coder(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("程序员" + getName() + "工号："
                + getId() + "正在工作，工资" + getSalary());
    }
}
