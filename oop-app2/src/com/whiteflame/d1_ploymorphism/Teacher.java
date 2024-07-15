package com.whiteflame.d1_ploymorphism;

public class Teacher extends People{
    String name = "Teacher";
    @Override
    public void run(){
        System.out.println("Teacher can run slowly");
    }

    public void teach(){
        System.out.println("Teacher can teach also");
    }
}
