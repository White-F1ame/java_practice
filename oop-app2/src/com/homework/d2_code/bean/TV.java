package com.homework.d2_code.bean;

public class TV {
    private String name;

    public void play(String channel) {
        System.out.println(getName() + "电视正在播放" + channel);
    }

    public TV() {
    }

    public TV(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
