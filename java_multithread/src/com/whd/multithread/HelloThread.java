package com.whd.multithread;

/**
 * 输出100以内偶数
 *
 * @author wanghaidi
 * @create 2022-02-16 19:34
 */
public class HelloThread extends Thread {
    public HelloThread() {
    }

    public HelloThread(String name) {
        super(name);
    }

    /**
     * 输出100以内偶数线程
     */
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("偶数--" + Thread.currentThread().getName() +
                        ":" + i + "优先级:" + Thread.currentThread().getPriority());
            }
            /*if (i % 20 ==0){
                yield();
                System.out.println("......");
            }*/
        }
    }
}
