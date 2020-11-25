package com.bink.teststop;

/**
 * 使用次数停止线程
 * 使用标志位
 *
 * @author yangbingkun
 * @Package com.bink.teststop
 * @date 2020/11/25 --9:54 上午
 */
public class TestStop implements Runnable {
    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("Run...Thread" + i++);
        }
    }

    public void stop() {
        this.flag = false;
    }

    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        new Thread(testStop).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main" + i);
            if (i == 9) {
                testStop.stop();
                System.out.println("线程该停止了。。。。");
            }
        }
    }

}
