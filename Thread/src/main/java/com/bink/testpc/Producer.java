package com.bink.testpc;

/**
 * @author yangbingkun
 * @Package com.bink.testpc
 * @date 2020/11/25 --2:41 下午
 */
class Producer extends Thread {
    SyncContainer container;

    public Producer(SyncContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            container.push(new Chicken(i));
            System.out.println("生产了" + i + "只鸡！");
        }
    }
}
