package com.whiteflame.d6_generics_interface;

public interface Data<E extends Weather> {
    void test(E e);
}
