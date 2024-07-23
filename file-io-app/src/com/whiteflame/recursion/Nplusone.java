package com.whiteflame.recursion;

public class Nplusone {
    public static void main(String[] args) {
        System.out.println(f(3));
    }
    public static int f(int n){
        return n == 1 ? 1 : f(n - 1) * n;
    }

}
