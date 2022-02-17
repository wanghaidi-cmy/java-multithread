package com.whd.exer.pojo;

/**
 * 输出100以内的偶数
 * @author wanghaidi
 * @create 2022-02-16 19:00
 */
public class EvenNumberThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println("偶数--"+Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
