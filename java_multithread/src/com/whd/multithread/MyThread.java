package com.whd.multithread;

/**
 * @author wanghaidi
 * @create 2022-02-16 17:27
 */
public class MyThread {
    public static void main(String[] args) {
        //3. 创建Thread类的子类的对象
        Thread threadTest = new ThreadTest();
        //4. 通过此对象调用start()：①启动当前线程 ② 调用当前线程的run()
        //问题一：我们不能通过直接调用run()方法的方式启动线程
        threadTest.start();
        //问题二：再启动一个线程，输出100以内的偶数，不能让已经start()的线程去执行，会报出IllegalThreadStateException异常
        //如下操作仍然是在main线程中执行的。
        //threadTest.start();
        //问题二：如果再启动一个线程，必须重新创建一个Thread子类的对象，调用此对象的start().
        Thread thread = new ThreadTest();
        thread.start();
        for(int i = 1; i < 100;i++){
            if(i % 2 != 0){
                //获取档前线程名称Thread.currentThread().getName()
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
