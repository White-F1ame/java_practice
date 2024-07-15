package com.whiteflame.d5_abstract_template_method;

public abstract class Weather {
    //添加final关键字，确保模板不被子类重写
    public final void today(){
        System.out.println("How is weather today?");
        System.out.println(weather());
        System.out.println("Have a nice day!");
    }
    public abstract String weather();
}
