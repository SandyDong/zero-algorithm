package com.dong.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 通过线程池执行任务
 */
public class ThreadImplByThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        executorService.submit(new MyRunnable());

        MyRunnable myRunnable = new MyRunnable();

        for (int i = 0; i < 3; i++) {
            executorService.submit(myRunnable);
        }

        executorService.shutdown();

        /**
         * 执行的结果如下图：
         * pool-1-thread-2===>0
         * pool-1-thread-3===>0
         * pool-1-thread-3===>1
         * pool-1-thread-3===>2
         * pool-1-thread-3===>3
         * pool-1-thread-3===>4
         * pool-1-thread-1===>0
         * pool-1-thread-1===>1
         * pool-1-thread-1===>2
         * pool-1-thread-1===>3
         * pool-1-thread-1===>4
         * pool-1-thread-2===>1
         * pool-1-thread-2===>2
         * pool-1-thread-2===>3
         * pool-1-thread-2===>4
         */

    }
}

/**
 * 定义待执行的任务
 */
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "===>" + i);
        }
    }
}
