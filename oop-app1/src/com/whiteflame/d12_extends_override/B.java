package com.whiteflame.d12_extends_override;

public class B extends A {
    @Override
    public void print1() {
        System.out.println("003");
    }

    @Override
    public void print2(int a){
        System.out.println(a);
    }
}
