package com.practice.d16_homework;

/**
 * 1.定义项目经理类
 * 属性：
 * 姓名 工号 工资 奖金
 * 行为：
 * 工作work
 * 2.定义程序员类
 * 属性：
 * 姓名 工号 工资
 * 行为：
 * 工作work
 * 3.要求:向上抽取一个父类,让这两个类都继承这个父类,共有的属性写在父类中，子类重写父类中的方法
 * 编写测试类:完成这两个类的测试
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("周工");
        manager.setId("13111211");
        manager.setSalary(30000);
        manager.setBonus(10000);
        manager.work();

        Coder coder = new Coder("老鼠","114514",3000);
        coder.work();
    }
}
