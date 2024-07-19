package com.whiteflame.day01.practice01;

/**
 * 1.1、定义Window类，表示卖票窗口。
 */
public class Window {
    /**
     * 1.2、提供name属性，代表窗口名称，ticketNumber属性，代表电影票数。
     */
    private String name;
    private static int ticketNumber = 100;


    public Window(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getTicketNumber() {
        return ticketNumber;
    }

    public static void setTicketNumber(int ticketNumber) {
        Window.ticketNumber = ticketNumber;
    }

    public Window() {
    }
    public void saleTicket() {
        if (Window.ticketNumber>0) {
            int tickets = Window.getTicketNumber() - 1;
            Window.setTicketNumber(tickets);
            System.out.println("sale successful, there are " + Window.getTicketNumber() + " left");
        }else {
            System.out.println("Failure, there are no tickets");
        }
    }
}
