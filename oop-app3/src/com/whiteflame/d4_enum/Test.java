package com.whiteflame.d4_enum;

import java.security.PublicKey;

public class Test {
    public static void main(String[] args) {
        System.out.println("Which color's do you love?");
        whichColor(A.RED);
        whichColor(A.BLUE);
        whichColor(A.WHITE);
        whichColor(A.BLACK);
    }

    public static void whichColor (A color) {
        switch (color) {
            case RED -> System.out.println("RED feel like enthusiastic!");
            case BLUE -> System.out.println("BLUE feel like blue!");
            case WHITE -> System.out.println("WHITE feel like pure!");
            case BLACK -> System.out.println("BLACK feel like calm!");
        }
    }
}
