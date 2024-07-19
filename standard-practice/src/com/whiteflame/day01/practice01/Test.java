package com.whiteflame.day01.practice01;

public class Test {
    /**
     * 目标：通过练习，能够明确static修饰变量的使用场景，掌握static的使用<p>
     * 1.需求<p>
     * 电影院有多个窗口，一场电影可以卖出100张票，假设有3个窗口卖这100张票<p>
     * 要求：<p>
     * 1.1、定义Window类，表示卖票窗口。<p>
     * 1.2、提供name属性，代表窗口名称，ticketNumber属性，代表电影票数。<p>
     * 1.3、定义saleTicket()方法，每次调用该方法，表示卖出一张票，打印”售票成功，剩余票数xx张”。<p>
     * 2.技术点说明<p>
     * static修饰变量<p>
     * 3.思路分析<p>
     * 3.1.先定义一个类Window，代表卖票的窗口<p>
     * 3.2.分析类中的属性：有name和ticketNumber。每个窗口的name各自有各自的名字，使用普通成员变量<p>
     *   多个窗口卖的是同一份的票,窗口共享同一份数据，使用静态成员变量<p>
     * 3.3.按照标准的JavaBean去创建出Window类。并且额外提供一个saleTicket()方法，代表售票<p>
     * 3.4.创建实体类，创建三个窗口对象。分别调用saleTicket()方法，代表售票。<p>
     */
    public static void main(String[] args) {
        Window window1 = new Window("窗口一");
        Window window2 = new Window("窗口二");
        Window window3 = new Window("窗口三");

        window1.saleTicket();
        window2.saleTicket();
        window3.saleTicket();
    }

}
