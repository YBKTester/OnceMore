package com.bink;

/**
 * 线程开启不一定立即执行，要等待CPU安排调度
 *
 * @author yangbingkun
 * @Package com.bink
 * @date 2020/11/23 --2:23 下午
 */
public class TestThread extends Thread {
    private static final int TIMES = 200;

    @Override
    public void run() {
        for (int i = 0; i < TIMES; i++) {
            System.out.println("我在看代码。。。。" + i);
        }
    }

    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();

        for (int i = 0; i < TIMES; i++) {
            System.out.println("我在学习多线程。。。。" + i);
        }
    }
}
