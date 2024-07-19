package com.whiteflame.day04.d7_localdatetime;

import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime newLdt = ldt.plusDays(100);
        System.out.println("100天后是"
                + newLdt.getYear() + "年"
                + newLdt.getMonthValue() + "月"
                + newLdt.getDayOfMonth() + "日");
    }
}
