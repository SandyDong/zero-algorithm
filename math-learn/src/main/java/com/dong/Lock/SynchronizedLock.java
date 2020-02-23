package com.dong.Lock;

/**
 * 测试锁的功能
 * Synchronized是可重入锁，重新进入锁，其好处是在一定程度上避免死锁
 *
 */
public class SynchronizedLock {

    public  synchronized void  sendSyncMessageA(){
        System.out.println("A-->发送同步信息!----start---");
        sendSyncMessageB();
    }

    public  synchronized void  sendSyncMessageB(){
        System.out.println("B-->发送同步信息!----end---");
    }

    public static void main(String[] args) {
        System.out.println("--------------测试锁的使用---------------");
        SynchronizedLock synchronizedLock = new SynchronizedLock();
//        synchronizedLock.sendSyncMessageA();

        for (int i = 0; i <20 ; i++) {
            //模拟多个线程操作
            new Runnable() {
                @Override
                public void run() {
                    synchronizedLock.sendSyncMessageA();
                }
            }.run();
        }

        for (int i = 0; i <20 ; i++) {
            //模拟多个线程操作
            new Runnable() {
                @Override
                public void run() {
                    synchronizedLock.sendSyncMessageA();
                }
            }.run();
        }
    }
}
