package com.bink;

/**
 * @author yangbingkun
 * @Package com.bink
 * @date 2020/11/23 --3:36 下午
 */
public class RunnableTest implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("*******************" + i);
        }
    }

    public static void main(String[] args) {
        RunnableTest run = new RunnableTest();

        new Thread(run).start();

        for (int i = 0; i < 100; i++) {
            System.out.println("==================="+i);
        }
    }
}
