package com.practice.d7_extends;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.i =10;
        //z.j = 11;
        z.setK(12);
        System.out.println(z.i+" "+z.getK());
        z.publicMethod();
        //z.privateMehtod();
    }
}
class Fu{
    //
    public int i;
    public void publicMethod(){
        System.out.println("public method");
    }

    private int j;
    private void privateMethod(){
        System.out.println("private method");
    }
}
class Zi extends Fu{
    private int k;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}
