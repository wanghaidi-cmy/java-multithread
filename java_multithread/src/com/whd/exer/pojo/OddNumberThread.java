package com.whd.exer.pojo;

/**
 * 输出100以内的奇数
 *
 * @author wanghaidi
 * @create 2022-02-16 18:59
 */
public class OddNumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println("奇数--" + Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
