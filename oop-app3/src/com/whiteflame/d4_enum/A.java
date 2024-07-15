package com.whiteflame.d4_enum;

// 枚举类 enumeration
public enum A {
    //本质是常量(默认static final 修饰)，每个名称对应的是枚举类的对象
    RED,
    BLUE,
    WHITE,
    BLACK;

    private String valueRGB;

    //构造器默认private修饰
    A(){
    }

    public String getValueRGB() {
        return valueRGB;
    }

    public void setValueRGB(String valueRGB) {
        this.valueRGB = valueRGB;
    }
}
