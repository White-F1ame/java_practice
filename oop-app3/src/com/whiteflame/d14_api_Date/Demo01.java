package com.whiteflame.d14_api_Date;

import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        //创建Date日期类对象
        Date d1 = new Date();
        System.out.println(d1);

        //获取时间的毫秒值
        long time2 = d1.getTime();
        Date d2 = new Date(time2);
        System.out.println(d2);

        //设置时间
        long time1 = System.currentTimeMillis();
        time1 += 2 * 1000;
        Date d3 = new Date();
        d3.setTime(time1);
        System.out.println(d3);


    }
}
