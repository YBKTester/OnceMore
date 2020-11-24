package com.bink;

/**
 * @author yangbingkun
 * @Package com.bink
 * @date 2020/11/24 --10:19 上午
 */
public class Tickets implements Runnable {
    private int ticketsNum = 10;


    public void run() {
        while (true) {
            if (ticketsNum <= 0) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "  拿到了第" + ticketsNum-- + "张票！");
        }
    }

    public static void main(String[] args) {
        Tickets tickets = new Tickets();
        new Thread(tickets, "Bink").start();
        new Thread(tickets, "Bing").start();
        new Thread(tickets, "HN").start();
    }
}
