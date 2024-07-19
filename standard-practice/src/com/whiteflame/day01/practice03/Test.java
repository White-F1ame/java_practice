package com.whiteflame.day01.practice03;

import com.whiteflame.day01.practice03.bean.Coder;
import com.whiteflame.day01.practice03.bean.Teacher;

public class Test {
    /**
     *> 目标：通过练习，掌握使用继承去减少多个类中相同代码的冗余<p>
     * 1.需求<p>
     * 请使用继承定义以下类:<p>
     * 程序员(Coder)<p>
     *   成员变量: 姓名,年龄<p>
     *   成员方法: 吃饭,睡觉,敲代码<p>
     *<p>
     * 老师(Teacher)<p>
     *   成员变量: 姓名,年龄<p>
     *   成员方法: 吃饭,睡觉,上课<p>
     *<p>
     * 按照步骤，在控制台输出实现效果如下：<p>
     *<p>
     * 马化腾在吃饭<p>
     * 马化腾睡觉<p>
     * 马化腾敲代码<p>
     * -------------------<p>
     * 马云在吃饭<p>
     * 马云在睡觉<p>
     * 马云在上课<p>
     *<p>
     * 2.技术点说明<p>
     * * 继承的练习<p>
     *<p>
     * 3.思路分析<p>
     * 1. 定义父类Person类,将程序员和老师中相同的内容(姓名,年龄,吃饭,睡觉)抽取到父类Person中<p>
     * 2. 定义Coder类继承Person类,添加敲代码方法<p>
     * 3. 定义Teacher类继承Person类,添加上课方法<p>
     * 4. 在测试类中，创建Code对象,并设置成员变量的值,调用Coder对象的eat,sleep,coding方法.创建Teacher对象,并设置成员变量的值,调用Teacher对象的eat,sleep,teach方法<p>
     */
    public static void main(String[] args) {
        Coder mht = new Coder();
        mht.setName("马化腾");
        mht.setAge(18);

        Teacher my = new Teacher();
        my.setName("马云");
        my.setAge(19);

        mht.eat();
        mht.rest();
        mht.programming();
        System.out.println("-------------------");
        my.eat();
        my.rest();
        my.teach();
    }
}
