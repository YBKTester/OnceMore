package com.bink.testpc;

/**
 * @author yangbingkun
 * @date 2020/11/25 --2:41 下午
 */
class Consumer extends Thread {

    SyncContainer container;

    public Consumer(SyncContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        int max = 100;
        for (int i = 0; i < max; i++) {
            System.out.println("消费了" + container.pop().id + "只鸡！");
        }
    }
}
