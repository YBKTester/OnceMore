package com.bink.proxy;

/**
 * 代理角色：中介
 *
 * @author yangbingkun
 * @Package com.bink.proxy
 * @date 2020/11/26 --9:32 上午
 */
public class Proxy1 implements Rent {
    private Host host;

    public Proxy1() {
    }

    public Proxy1(Host host) {
        this.host = host;
    }


    @Override
    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }

    private void fare() {
        System.out.println("签订合同，收取中介费！");
    }

    private void seeHouse() {
        System.out.println("中介：带看房屋！");
    }
}
