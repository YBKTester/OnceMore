package com.bink.staticProxy.impl;

import com.bink.staticProxy.DAO.Marry;

/**
 * @author yangbingkun
 * @Package com.bink
 * @date 2020/11/24 --1:49 下午
 */
public class You implements Marry {
    @Override
    public void happyMarry() {
        System.out.println("今天要结婚了，好开心。。。。");
    }
}
