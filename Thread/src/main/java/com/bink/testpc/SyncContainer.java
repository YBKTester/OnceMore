package com.bink.testpc;

/**
 * @author yangbingkun
 * @Package com.bink.testpc
 * @date 2020/11/25 --2:41 下午
 */
class SyncContainer {
    Chicken[] chickens = new Chicken[10];
    /**
     * 容器计数器
     */
    int count = 0;

    /**
     * 放入产品
     */
    public synchronized void push(Chicken chicken) {
        //如果容器已满，通知消费者消费
        if (count == chickens.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        chickens[count] = chicken;
        count++;

        this.notifyAll();
    }

    /**
     * 消费
     *
     * @return 鸡
     */
    public synchronized Chicken pop() {
//        判断能否消费
        if (count == 0) {
//          等待生产
            try {
                this.wait();
                System.out.println("等待生产！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        //  消费鸡
        this.notifyAll();
        return chickens[count];
    }
}
