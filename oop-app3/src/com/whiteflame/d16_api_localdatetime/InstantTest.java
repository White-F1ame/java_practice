package com.whiteflame.d16_api_localdatetime;

import java.time.Instant;

public class InstantTest {
    /**
     *instant 时间线上的某个时刻/时间戳
     * <P>
     *- 通过获取Instant的对象可以拿到此刻的时间，该时间由两部分组成：
     *从1970-01-01 00:00:00开始走到此刻的总秒数+不够一秒的纳秒数
     * <P>
     *- 作用：可以用来记录代码的执行时间，或用于记录用户操作某个事件的时间点
     * <P>
     *- 传统的Date类，只能精确到毫秒，并且是可变对象
     * <P>
     *- 新增额instant类，可以精确到纳秒，并且是不可变对象，推荐用Instant代替Date
     */
    public static void main(String[] args) {

        // 获取Instant类的对象
        Instant ins = Instant.now();
        System.out.println(ins);

        // 获取从1970年1月1日 0时0分0秒到现在的总秒数
        System.out.println(ins.getEpochSecond());

        // 获取到不够一秒的纳秒数
        int now = ins.getNano();
        System.out.println(now);

        Instant instant = ins.plusNanos(100);
        int now2 = instant.getNano();
        System.out.println(now2);

    }
}
