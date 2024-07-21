package com.whiteflame.d2_list;

import java.util.LinkedList;

public class LinkedListQueue {
    public static void main(String[] args) {

        //使用linkedlist设计队列
        LinkedList<String> queue = new LinkedList<>();


        System.out.println(queue);
        //模拟入队，从屁股进
        System.out.println("进来了哦🏃‍🏃🏃");
        queue.addLast("德莱文");
        System.out.println(queue);
        queue.addLast("亚索");
        System.out.println(queue);
        queue.addLast("佐伊");
        System.out.println(queue);
        queue.addLast("亚托克斯");
        System.out.println(queue);

        //模拟出队，从头出
        System.out.println("出去了哦💃💃💃");
        queue.removeFirst();
        System.out.println(queue);
        queue.removeFirst();
        System.out.println(queue);
        //或者
        queue.remove(0);
        System.out.println(queue);
        queue.remove(0);
        System.out.println(queue);


    }
}
