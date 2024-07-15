package com.whiteflame.d1_inner_class1;

public class Outer {
    private int age = 38;
    public class Inner{
        private int age = 28;
        public void method(){
            int age = 18;
            System.out.println(age);//18
            System.out.println(this.age);//28
            System.out.println(Outer.this.age);//38

        }
    }
}
