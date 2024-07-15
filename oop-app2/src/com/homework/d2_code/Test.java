package com.homework.d2_code;

import com.homework.d2_code.bean.TV;

public class Test {
    public static void main(String[] args) {
        TV tv = new TV("东方卫视");
        RemoteControl r = new RemoteControl();
        r.controlTV(tv);
    }
}
