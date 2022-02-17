package com.whd.multithread;

/**
 * 实现类实现Runnable接口
 * @author wanghaidi
 * @create 2022-02-16 22:51
 */
public class Ticket implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ":卖出票号--" + ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
