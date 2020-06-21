package com.dong.Lock;

/**
 * 测试锁的功能
 * Synchronized是可重入锁，重新进入锁，其好处是在一定程度上避免死锁
 * date 2020.06.14
 * 描述:经过如下测试可以得出:
 *    1 synchronized 是可重入锁(也就是同一个线程可以重复获取锁,同样释放的时候也需要一步一步释放)
 *    2 synchronized 是独占锁(一个线程从获取锁到释放锁的过程中，别的线程获取锁出现失败，属于竞争失败,不会被挂起,并且会不断地尝试获取锁)
 *    3 synchronized 为非公平锁(当前线程释放锁之后，其它阻塞线程获取锁时的顺序并不是按照创建线程时候的顺序)。
 */
public class TestSynchronized implements Runnable {

    public synchronized void sendSyncMessageA() {
        System.out.println("2--->线程:" + Thread.currentThread().getName() + "进入同步sendSyncMessageA()!---");
        sendSyncMessageB();
        System.out.println("3--->线程:" + Thread.currentThread().getName() + "离开同步sendSyncMessageA()!---");
    }

    public synchronized void sendSyncMessageB() {
        System.out.println("4--->线程:" + Thread.currentThread().getName() + "进入同步sendSyncMessageB()!---");
    }


    @Override
    public void run() {
        System.out.println("1--->线程:" + Thread.currentThread().getName() + "进入入口run()方法!---");
        this.sendSyncMessageA();
    }


    public static void main(String[] args) {
        System.out.println("--------------测试锁的使用---------------");
        final TestSynchronized testSynchronized = new TestSynchronized();

        //模拟多线程操作!
        for (int i = 0; i < 8; i++) {
            new Thread(testSynchronized, "thread-" + i).start();
        }
    }
}
