package com.homework.d1_code;

public abstract class Animal {
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;
    public void drink(){
        System.out.println("喝水");
    }
    abstract void eat();

}
