package com.dong.Lock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * java api lock的使用
 *
 * 乐观锁/悲观锁
 * 独享锁/共享锁
 * 互斥锁/读写锁
 * 可重入锁
 * 公平锁/非公平锁
 * 分段锁
 * 偏向锁/轻量级锁/重量级锁
 * 自旋锁
 */
public class LockApi {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(10);
        System.out.println(atomicInteger.get());

        int i =0;
        do {
            i++;
            System.out.println("aaa");
        }while (i<3);

        ReentrantLock reentrantLock = new ReentrantLock();
    }



}
