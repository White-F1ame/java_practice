package com.whiteflame.d15_api_calendar;

import java.util.Calendar;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        Date date = calendar.getTime();
        System.out.println(date);

        calendar.set(Calendar.MONTH,7);//月份从0开始算
        System.out.println(calendar);

        calendar.add(Calendar.DAY_OF_YEAR,10);
        calendar.add(Calendar.DAY_OF_MONTH,2);
        System.out.println(calendar);

        calendar.set(2025,1,1);
        System.out.println(calendar);
    }
}
