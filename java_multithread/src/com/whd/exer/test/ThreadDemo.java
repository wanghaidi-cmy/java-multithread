package com.whd.exer.test;

import com.whd.exer.pojo.EvenNumberThread;
import com.whd.exer.pojo.OddNumberThread;

/**
 * 创建两个分线程，让其中一个线程输出1-100之间的偶数，另一 个线程输出1-100之间的奇数
 *
 * @author wanghaidi
 * @create 2022-02-16 18:56
 */
public class ThreadDemo {
    public static void main(String[] args) {
        /*Thread thread1 = new EvenNumberThread();
        Thread thread2 = new OddNumberThread();
        thread1.start();
        thread2.start();*/
        /**
         * 使用Thread匿名子类的方式
         */
        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println("偶数--" + Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println("奇数--" + Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();
    }
}
