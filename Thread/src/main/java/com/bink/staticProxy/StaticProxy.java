package com.bink.staticProxy;


import com.bink.staticProxy.impl.WeddingCompany;
import com.bink.staticProxy.impl.You;

/**
 * 静态代理
 *
 * @author yangbingkun
 * @Package com.bink
 * @date 2020/11/24 --11:10 上午
 */
public class StaticProxy {
    public static void main(String[] args) {
        WeddingCompany weddingCompany = new WeddingCompany(new You());
        weddingCompany.happyMarry();
    }
}

