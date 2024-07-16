package com.whiteflame.d16_api_localdatetime;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2024,7,16,10,34,0);
        LocalDateTime ldt2 = LocalDateTime.of(2024,8,14,8,0,0);

        Duration d = Duration.between(ldt1,ldt2);

        System.out.println(d.toDays()+"d");
        System.out.println(d.toHours()+"h");
        System.out.println(d.toMinutes()+"m");
        System.out.println(d.toSeconds()+"s");

    }
}
