package com.whiteflame.d8_extends;

public class Teacher extends People{
    //子类
    private String skill;
    public void info(){
        System.out.println(getName()+skill);
    }


    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
