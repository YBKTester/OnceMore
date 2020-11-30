package com.bink.proxy;

/**
 * 客户
 *
 * @author yangbingkun
 * @Package com.bink.proxy
 * @date 2020/11/26 --9:34 上午
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
//        Proxy1 proxy = new Proxy1(host);
//        proxy.rent();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(host);
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
