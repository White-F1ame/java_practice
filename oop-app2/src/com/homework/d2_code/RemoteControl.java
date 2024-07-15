package com.homework.d2_code;

import com.homework.d2_code.bean.TV;

import java.util.Scanner;

public class RemoteControl {
    public void controlTV(TV tv){
        System.out.println("遥控器控制电视");
        Scanner sc = new Scanner(System.in);
        String channel = sc.nextLine();
        tv.play(channel);
    }
}
