package com.practice.d16_homework;

public class Manager extends Employee {

    private double bonus;

    @Override
    public void work() {
        System.out.println("项目经理" + getName() + "工号："
                + getId() + "正在工作，工资" + getSalary()
                + "奖金：" + getBonus());
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager() {
    }

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
}
