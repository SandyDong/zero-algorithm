package com.dong.Lock;


import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dongwenqiang
 * @date 2020-06-15
 * @description 测试可重入锁(既可以实现公平锁 ， 也可以实现非公平锁)
 */
public class TestReentrantLock implements Runnable {

    /**
     * 定义可重入锁(如下方式默认是非公平锁)
     */
//    private ReentrantLock reentrantLock = new ReentrantLock();

    /**
     * 定义可重入锁(如下方式实现是公平锁)
     */
    private ReentrantLock reentrantLock = new ReentrantLock(true);

    public void get() {
        reentrantLock.lock();
        System.out.println("进入 get()方法 " + Thread.currentThread().getName());
        set();
        System.out.println("离开 get()方法 " + Thread.currentThread().getName());
        reentrantLock.unlock();
    }

    public void set() {
        reentrantLock.lock();
        System.out.println("进入 set()方法 " + Thread.currentThread().getName());
        System.out.println("离开 set()方法 " + Thread.currentThread().getName());
        reentrantLock.unlock();
    }

    @Override
    public void run() {
        System.out.println("进入线程run()方法 " + Thread.currentThread().getName());
        get();
    }

    public static void main(String[] args) {
        TestReentrantLock testReentrantLock = new TestReentrantLock();
        for (int i = 0; i < 6; i++) {
            new Thread(testReentrantLock, "Thread" + i).start();
        }
    }

    //测试数据结果如下图(非公平锁的实现，测试结果数据如下)
    /***
     *进入线程run()方法 Thread1
     * 进入线程run()方法 Thread2
     * 进入线程run()方法 Thread3
     * 进入线程run()方法 Thread0
     * 进入线程run()方法 Thread4
     * 进入 get()方法 Thread1
     * 进入 set()方法 Thread1
     * 离开 set()方法 Thread1
     * 离开 get()方法 Thread1
     * 进入 get()方法 Thread2
     * 进入 set()方法 Thread2
     * 离开 set()方法 Thread2
     * 离开 get()方法 Thread2
     * 进入线程run()方法 Thread5
     * 进入 get()方法 Thread5
     * 进入 set()方法 Thread5
     * 离开 set()方法 Thread5
     * 离开 get()方法 Thread5
     * 进入 get()方法 Thread3
     * 进入 set()方法 Thread3
     * 离开 set()方法 Thread3
     * 离开 get()方法 Thread3
     * 进入 get()方法 Thread0
     * 进入 set()方法 Thread0
     * 离开 set()方法 Thread0
     * 离开 get()方法 Thread0
     * 进入 get()方法 Thread4
     * 进入 set()方法 Thread4
     * 离开 set()方法 Thread4
     * 离开 get()方法 Thread4
     *
     */

    //测试数据结果如下图(公平锁的实现，测试结果数据如下)
    /**
     *
     * 进入线程run()方法 Thread1
     * 进入线程run()方法 Thread2
     * 进入 get()方法 Thread1
     * 进入线程run()方法 Thread0
     * 进入线程run()方法 Thread3
     * 进入线程run()方法 Thread4
     * 进入线程run()方法 Thread5
     * 进入 set()方法 Thread1
     * 离开 set()方法 Thread1
     * 离开 get()方法 Thread1
     * 进入 get()方法 Thread2
     * 进入 set()方法 Thread2
     * 离开 set()方法 Thread2
     * 离开 get()方法 Thread2
     * 进入 get()方法 Thread0
     * 进入 set()方法 Thread0
     * 离开 set()方法 Thread0
     * 离开 get()方法 Thread0
     * 进入 get()方法 Thread3
     * 进入 set()方法 Thread3
     * 离开 set()方法 Thread3
     * 离开 get()方法 Thread3
     * 进入 get()方法 Thread4
     * 进入 set()方法 Thread4
     * 离开 set()方法 Thread4
     * 离开 get()方法 Thread4
     * 进入 get()方法 Thread5
     * 进入 set()方法 Thread5
     * 离开 set()方法 Thread5
     * 离开 get()方法 Thread5
     */
}
