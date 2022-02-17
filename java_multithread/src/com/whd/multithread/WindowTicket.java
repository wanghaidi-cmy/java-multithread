package com.whd.multithread;

/**
 * 继承Thread实现卖票
 * @author wanghaidi
 * @create 2022-02-16 22:45
 */
public class WindowTicket extends Thread{
    /**
     * 票数
     */
    private static int ticket = 100;
    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ":卖出票号--" + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}
