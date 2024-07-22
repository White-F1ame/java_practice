package com.whiteflame.day06.atm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
        }catch (InputMismatchException e){
            throw new MyException("错了");
        }
    }
}
