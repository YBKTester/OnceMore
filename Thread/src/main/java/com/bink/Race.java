package com.bink;

/**
 * @author yangbingkun
 * @Package com.bink
 * @date 2020/11/24 --10:47 上午
 */
public class Race implements Runnable {
    private static String winner;

    public void run() {
        for (int i = 0; i <= 100; i++) {
            if ("小兔子".equals(Thread.currentThread().getName())) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            boolean flag = gameOver(i);
            if (flag) {
                break;
            }
            System.out.println(
                    Thread.currentThread().getName() + "跑了：" + i + "步！"
            );
        }
    }

    private boolean gameOver(int steps) {
        if (winner != null) {
            return true;
        }
        {
            if (steps >= 100) {
                winner = Thread.currentThread().getName();
                System.out.println("Winner is " + winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race, "小兔子").start();
        new Thread(race, "小乌龟").start();
    }
}
