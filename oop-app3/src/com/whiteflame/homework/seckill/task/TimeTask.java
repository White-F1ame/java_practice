package com.whiteflame.homework.seckill.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class TimeTask extends TimerTask {

    // 定义秒杀开始时间
    private long startTime;

    // 构造方法，对秒杀开始时间进行初始化
    public TimeTask() throws ParseException {
        // 补全代码
        this.run();

    }

    @Override
    public void run() {    // 每一秒执行一次该方法

        // 补全代码
        //创建一个现在的时间
        Date start = new Date();
        //转成毫秒值
        long startTime = start.getTime();
        //创建秒杀开始的时间,一个时间字符串
        String str = "2024年7月16日 6:0:0";
        //把字符串的时间解析成日期对象。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date end = null;
        try {
            end = sdf.parse(str);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        //转换成毫秒值
        long endTime = end.getTime();
        long ms = endTime - startTime;
        long second = ms / 1000 % 60;
        long min = ms / 1000 / 60 % 60;
        long hour = ms / 1000 / 60 / 60;
        System.out.println("即将开始,距开始还有:" + hour + "小时" + min + "分钟" + second + "秒");
    }

}
