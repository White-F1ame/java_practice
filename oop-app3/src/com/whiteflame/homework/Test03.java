package com.whiteflame.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test03 {
    /**
     * 掌握JDK 8以前版本时间类的使用。
     * 1. 已知日期字符串:"2015-10-20",将该日期字符串转换为日期对象；
     * 2. 将(1)中的日期对象转换为日历类的对象；
     * 3. 根据日期对象获取该日期是星期几,以及这一年的第几天
     * 4. 通过键盘录入日期字符串，格式(2015-10-20)
     * 	如输入：2015-10-20，输出"2015年-10月-20日 是 星期二，是2015年的第 293 天"
     */
    public static void main(String[] args) {


    }
    public static void day(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //String str = "2024年7月16日 6:0:0";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    }
}
