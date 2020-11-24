package com.bink.staticProxy.impl;

import com.bink.staticProxy.DAO.Marry;

/**
 * @author yangbingkun
 * @Package com.bink
 * @date 2020/11/24 --1:49 下午
 */
public class WeddingCompany implements Marry {

    private final Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        before();
        this.target.happyMarry();
        after();
    }

    private void after() {
        System.out.println("结婚之后，收尾款！");
    }

    private void before() {
        System.out.println("结婚之前，布置现场！");
    }
}
