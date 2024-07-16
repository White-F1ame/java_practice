package com.whiteflame.d16_api_localdatetime;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {
    public static void main(String[] args) {
        //understanding ZoneId class
        //calling static method to create object
        ZoneId zoneId = ZoneId.systemDefault();

        System.out.println(zoneId.getId());//Asia/Shanghai
        System.out.println(zoneId);//Asia/Shanghai

        //get the time zone supported in java
        System.out.println(ZoneId.getAvailableZoneIds());

        // retrun object who encapsulates the time zone to zoneid
        ZoneId zoneId2 = ZoneId.of("America/Cuiaba");
        System.out.println(zoneId2);

        // use ZoneDateTime to obtain the time in the zone
        ZonedDateTime now = ZonedDateTime.now(zoneId2);
        System.out.println(now);

        System.out.println(now.getYear());//obtain the year
        System.out.println(now.getMonth());//obtain the month

        //Obtain the universal time
        System.out.println(ZonedDateTime.now(Clock.systemUTC()));


    }
}
