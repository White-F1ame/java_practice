package com.whiteflame.d5_generics;

public class MyArrayLis<E> {
    public boolean add(E e) {
        return true;
    }
}

class MyArrayList<E,T> {
    public boolean add(E e,T t) {
        System.out.println(e.getClass());
        System.out.println(t.getClass());
        return true;
    }
}