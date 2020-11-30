package com.bink.activeproxy;

import com.bink.proxy.ProxyInvocationHandler;

/**
 * @author yangbingkun
 * @Package com.bink.activeproxy
 * @date 2020/11/26 --9:53 上午
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
//        UserServiceProxy proxy = new UserServiceProxy(service);
//        proxy.add();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(service);
        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();
    }
}
