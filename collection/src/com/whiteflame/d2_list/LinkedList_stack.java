package com.whiteflame.d2_list;

import java.util.LinkedList;

public class LinkedList_stack {
    public static void main(String[] args) {
        //模拟stack

        LinkedList<String> stack = new LinkedList<>();
        //进栈
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println(stack);

        //出栈
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
