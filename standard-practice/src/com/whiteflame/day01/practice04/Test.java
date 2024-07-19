package com.whiteflame.day01.practice04;

public class Test {
    /**
     * > 目标：通过练习，掌握使用继承去减少多个类中相同代码的冗余<p>
     * 1.需求<p>
     * 请使用继承定义以下类:<p>
     * 狗(Dog)<p>
     *   成员变量: 姓名,颜色,价格<p>
     *   成员方法: 吃饭,看家<p>
     * 猫(Cat)<p>
     *   成员变量: 姓名,颜色,价格<p>
     *   成员方法: 吃饭,抓老鼠<p>
     * 按照步骤，在控制台输出实现效果如下：<p>
     * 金毛在吃饭<p>
     * 金毛在看家<p>
     * ----------------<p>
     * 橘猫在吃饭<p>
     * 橘猫在抓老鼠<p>
     *<p>
     * 2.技术点说明<p>
     * 继承的练习<p>
     *<p>
     * 3.思路分析<p>
     * 1. 定义父类Animal类,将狗和猫相同的内容(姓名,颜色,价格,吃饭)抽取到父类Animal中<p>
     * 2. 定义Dog类继承Animal类,添加看家方法<p>
     * 3. 定义Cat类继承Animal类,添加抓老鼠方法<p>
     * 4. 在测试类中，创建Dog对象,并设置成员变量的值,调用Dog对象的eat,lookHome方法.创建Cat对象,并设置成员变量的值,调用Cat对象的eat,catchMouse方法<p>
     */
    public static void main(String[] args) {

    }
}
