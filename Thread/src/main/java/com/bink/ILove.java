package com.bink;

import com.bink.Love;

/**
 * @author yangbingkun
 * @Package com.bink.staticProxy
 * @date 2020/11/24 --2:26 下午
 */
public class ILove implements Love {
    @Override
    public void loveU(int a) {
        System.out.println("I Love You!" + a);
    }
}
