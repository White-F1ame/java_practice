package com.whiteflame.d1_ploymorphism;

public class Student extends People{
    String name = "Student";
    @Override
    public void run(){
        System.out.println("Student can run fast");
    }

    public void study(){
        System.out.println("Studnet can study also");
    }
}
