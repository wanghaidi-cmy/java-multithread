package com.whd.multithread;

/**
 * 方式一：继承Thread类的方式：
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类的run() --> 将此线程执行的操作声明在run()中
 * 3. 创建Thread类的子类的对象
 * 4. 通过此对象调用start()：①启动当前线程 ② 调用当前线程的run()
 * @author wanghaidi
 * @create 2022-02-16 17:19
 */
public class ThreadTest extends Thread{//1. 创建一个继承于Thread类的子类

    /**
     * 2. 重写Thread类的run() --> 将此线程执行的操作声明在run()中
     */
    @Override
    public void run() {
        for(int i = 1; i < 100;i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
