package com.whiteflame.d11_extends_feature;

public class Test {
    public static void main(String[] args) {
    }
}
class A {//所以类都直接或间接继承Object类，Object类是所有类的祖宗类
}

class B extends A {//Java只支持单继承，一个类只能继承一个直接父类
}

//class C extends B,A{}//Java不支持多继承
class C extends B {//但Java支持多层继承
}