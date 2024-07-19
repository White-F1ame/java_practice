package com.whiteflame.day04.d8_datetimeformatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        LocalDateTime ldt = LocalDateTime.now();

        String text = ldt.format(formatter);
        System.out.println(text);
    }
}
