package com.bink.testpc;

/**
 * @author yangbingkun
 * @Package com.bink.testpc
 * @date 2020/11/25 --2:26 下午
 */
public class TestPC {
    public static void main(String[] args) {
        SyncContainer container = new SyncContainer();
        new Producer(container).start();
        new Consumer(container).start();
    }
}

