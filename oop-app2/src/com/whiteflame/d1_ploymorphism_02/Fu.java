package com.whiteflame.d1_ploymorphism_02;

public class Fu {
    String name = "Fu";
    public void run(){
        System.out.println("父sad run");
    }
    public static void father(Fu f){
        f.run();
    }
}
