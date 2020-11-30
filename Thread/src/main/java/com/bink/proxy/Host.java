package com.bink.proxy;

/**
 * 真实角色：房东出租房屋
 *
 * @author yangbingkun
 * @Package com.bink.proxy
 * @date 2020/11/26 --9:31 上午
 */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房屋出租！");
    }
}
