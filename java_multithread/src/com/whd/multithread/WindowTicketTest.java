package com.whd.multithread;

/**
 * 测试卖票
 * @author wanghaidi
 * @create 2022-02-16 22:49
 */
public class WindowTicketTest {
    public static void main(String[] args) {
        WindowTicket w1 = new WindowTicket();
        WindowTicket w2 = new WindowTicket();
        WindowTicket w3 = new WindowTicket();
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");
        w1.start();
        w2.start();
        w3.start();
    }
}
