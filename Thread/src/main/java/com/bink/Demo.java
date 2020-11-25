package com.bink;

/**
 * @author yangbingkun
 * @Package com.bink
 * @date 2020/11/24 --2:27 下午
 */
public class Demo {
    public static void main(String[] args) {

        Love love = new ILove();
        love.loveU(520);
        Love love1 = (a) -> {
            System.out.println("sad" + a);
        };

    }
}
