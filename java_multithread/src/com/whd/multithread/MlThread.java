package com.whd.multithread;

import static java.lang.System.*;

/**
 * @author wanghaidi
 * @create 2022-02-16 22:24
 */
public class MlThread implements Runnable {
    /**
     * 1. 创建一个实现了Runnable接口的类
     */
    @Override
    public void run() {//2. 实现类去实现Runnable中的抽象方法：run()
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

