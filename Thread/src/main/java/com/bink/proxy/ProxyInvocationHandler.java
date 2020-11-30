package com.bink.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yangbingkun
 * @Package com.bink.proxy
 * @date 2020/11/26 --9:59 上午
 */
public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 第二个参数，获取要代理的抽象角色！可以代理一类角色！
     *
     * @return 生成代理类
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        return method.invoke(target, args);
    }

    public void fare() {
        System.out.println("签订合同，收取中介费！");
    }

    public void seeHouse() {
        System.out.println("中介：带看房屋！");
    }

    public void log(String methodName) {
        System.out.println("执行了：" + methodName + " 操作！");
    }
}
