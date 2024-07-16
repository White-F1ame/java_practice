package com.whiteflame.d16_api_localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2022, 6, 2);
        LocalDate ld2 = LocalDate.of(2024, 1, 12);

        Period p = Period.between(ld1, ld2);

        System.out.println(p.getYears() + "年" + p.getMonths() + "月" + p.getDays() + "日");


    }
}
