package com.dong.Thread;

/**
 * @author dongwq
 * @description 守护线程与非守护线程
 * 在Java线程中有两种线程，一种是用户线程，另一种是守护线程。守护线程是一种特殊的线程，
 * <p>
 * 它的特性有“陪伴”的含义，当进程中不存在非守护线程了，则守护线程自动销毁。
 * 典型的守护线程就是垃圾回收线程，当进程中没有非守护线程了，则垃圾回收线程也就没有存在的必要了，自动销毁。
 * 用个比较通俗的比喻来解释一下“守护线程”：任何一个守护线程都是整个JVM中所有非守护线程的“保姆”，
 * 只要当前JVM实例中存在任何一个非守护线程没有结束，守护线程就在工作，只有当最后一个非守护线程结束时，守护线程才随着JVM一同结束工作。
 * Daemon的作用是为其他线程的运行提供便利服务，守护线程最典型的应用就是GC（垃圾回收器），它就是一个很称职的守护者。
 */
public class ThreadDemon {

    public static void main(String[] args) throws Exception {
        MyDemonThread myDemonThread = new MyDemonThread();
        myDemonThread.setDaemon(true);
        myDemonThread.start();
        Thread.sleep(8000);//休眠的是main主线程

        /***
         * 执行结果如下：
         *
         * 守护线程开始begin....
         * 守护线程打印的数字为:1
         * 守护线程打印的数字为:2
         * 守护线程打印的数字为:3
         * 守护线程打印的数字为:4
         * 守护线程打印的数字为:5
         * 守护线程打印的数字为:6
         * 守护线程打印的数字为:7
         * 守护线程打印的数字为:8
         *
         *
         *
         */
    }
}

class MyDemonThread extends Thread {
    @Override
    public void run() {
        super.run();
        int tempNum = 0;
        System.out.println("守护线程开始begin....");
        while (true) {
            try {
                tempNum++;
                System.out.println("守护线程打印的数字为:" + tempNum);
                Thread.sleep(1000);//休眠的是守护线程....
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
