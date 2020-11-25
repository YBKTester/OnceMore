package com.bink.testpc;

/**
 * @author yangbingkun
 * @Package com.bink.testpc
 * @date 2020/11/25 --2:41 下午
 */
class Consumer extends Thread {
    SyncContainer container;

    public Consumer(SyncContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了" + container.pop().id + "只鸡！");
        }
    }
}
