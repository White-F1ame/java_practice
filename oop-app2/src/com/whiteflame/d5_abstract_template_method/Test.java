package com.whiteflame.d5_abstract_template_method;

public class Test {
    public static void main(String[] args) {
        Weather r = new Rain();
        r.today();

        System.out.println();

        Weather s = new Sun();
        s.today();
    }
}
