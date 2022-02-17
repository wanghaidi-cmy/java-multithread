package com.whd.multithread;

/**
 * 方式二：实现Runnable接口的方式：
 * 1. 创建一个实现了Runnable接口的类
 * 2. 实现类去实现Runnable中的抽象方法：run()
 * 3. 创建实现类的对象
 * 4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5. 通过Thread类的对象调用start()
 * 两种方式的对比：
 *  开发中：优先选择：实现Runnable接口的方式
 *  原因：1. 实现的方式没类的单继承性的局限性
 *       2. 实现的方式更适合来处理多个线程共享数据的情况。
 *
 * 联系：public class Thread implements Runnable
 * 相同点：两种方式都需要重写run(),将线程要执行的逻辑声明在run()中。
 *       目前两种方式，要想启动线程，都是调用的Thread类中的start()。
 *
 * @author wanghaidi
 * @create 2022-02-16 22:24
 */
public class MlThreadTest {
    public static void main(String[] args){
        //3. 创建实现类的对象
        MlThread mlThread = new MlThread();
        //4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread thread = new Thread(mlThread);
        //5. 通过Thread类的对象调用start()
        thread.setName("线程1");
        thread.start();
        //再启动一个线程
        Thread thread1 = new Thread(mlThread);
        thread1.setName("线程2");
        thread1.start();
    }
}
