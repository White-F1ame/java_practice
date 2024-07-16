package com.whiteflame.d16_api_localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateTimeFormatter {
    public static void main(String[] args) {
        // 掌握使用DateTimeFormatter时间格式化类

        // 1、先获取格式化时间的对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        // 2、获取当前的日期时间
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        // 3、格式化时间1
        //String todayStr = dtf.format(today);
        //System.out.println(todayStr);

        //2
        String todayStr2 = today.format(dtf);
        System.out.println(todayStr2);

        //5解析字符串日期
        String todayDateTime = "2024年07月10日 10:12:10";
        LocalDateTime ldt = LocalDateTime.parse(todayDateTime,dtf);
        System.out.println(ldt.getYear());

    }
}
