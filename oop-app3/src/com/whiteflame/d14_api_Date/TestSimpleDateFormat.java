package com.whiteflame.d14_api_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
    public static void main(String[] args) throws InterruptedException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d1 = new Date();
        System.out.println(d1);
        System.out.println(sdf.format(d1));

        // 将日期字符串解析成Date对象
        String today = "2024-08-24 16:30:54";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf2.parse(today);
        System.out.println(date);
    }
}
