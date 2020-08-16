package com.dong.Thread;

/**
 * 测试线程休眠
 *
 * @author dongwenqiang
 * @description 方法sleep（）的作用是在指定的毫秒数内让当前“正在执行的线程”休眠（暂停执行）。
 * 这个“正在执行的线程”是指this.currentThread（）返回的线程。
 */
public class ThreadSleep {
    public static void main(String[] args) {
        MyThreadSleepOne myThreadSleepOne = new MyThreadSleepOne();
        System.out.println("begin----"+System.currentTimeMillis());
        myThreadSleepOne.start();
        System.out.println("end----"+System.currentTimeMillis());

        /**
         *
         *myThreadSleepOne.run();   //相当于同步调用，执行此处代码块的线程是main线程MyThreadSleepOne线程
         *
         *begin----1597581749112
         * main---begin start...
         * main---end start...
         * end----1597581751114
         */


        /**
         *
         *myThreadSleepOne.start();  //相当于异步调用，执行此处代码块的线程不是main线程，而是创建的
         *
         * begin----1597581912385
         * end----1597581912386
         * Thread-0---begin start...
         * Thread-0---end start...
         */
    }
}

class  MyThreadSleepOne extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName()+"---begin start...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"---end start...");
    }
}
