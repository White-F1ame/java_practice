package com.whiteflame.d6_generics_interface;

public class DataImpl implements Data<Weather>{
    @Override
    public void test(Weather weather) {
        System.out.println(weather.day);
    }

    public static void main(String[] args) {
        Data<Weather> day1 = new DataImpl();
        Weather rain = new Weather();
        day1.test(rain);
    }
}
