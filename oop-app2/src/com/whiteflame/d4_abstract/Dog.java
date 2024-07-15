package com.whiteflame.d4_abstract;

public class Dog extends Animal{
    @Override
    public void cry() {
        System.out.println("说：\"你看我钓到了什么？\"");
    }

    public void lookHome(){
        System.out.println("看门呐");
    }
}
