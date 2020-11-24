package com.bink.staticProxy;

/**
 * @author yangbingkun
 * @Package com.bink.staticProxy
 * @date 2020/11/24 --2:18 下午
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        TestCompany company = new TestCompany(new Test());
        company.test();
    }
}
