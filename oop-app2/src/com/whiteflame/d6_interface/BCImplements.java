package com.whiteflame.d6_interface;

public class BCImplements implements B,C{
    @Override
    public void run() {
        System.out.println("come!");
    }

    @Override
    public void showInfo() {
        System.out.println("C a name, I call my name!");
    }
}


