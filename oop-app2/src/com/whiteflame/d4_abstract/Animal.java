package com.whiteflame.d4_abstract;

public abstract class Animal {
    private String name;
    public abstract void cry();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
