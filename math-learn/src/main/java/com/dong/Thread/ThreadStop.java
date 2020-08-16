package com.dong.Thread;

/**
 * @author dongwq
 * @date 2020/08/16
 * @description
 */
public class ThreadStop {
    public static void main(String[] args) {
        MyThreadStop myThreadStop = new MyThreadStop();
        myThreadStop.start();
        //中断MyThreadStop子线程
        myThreadStop.interrupt();
        //isInterrupted()方法测试线程是否停止  执行结果为 true  即为该子线程已被中止
        System.out.println(myThreadStop.isInterrupted());

        //中断main主线程
        Thread.currentThread().interrupt();
        //isInterrupted()方法测试线程是否停止  执行结果为 true  即为该main线程已被中止
        System.out.println(Thread.currentThread().isInterrupted());
    }
}


class MyThreadStop extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("run方法开始执行............");
    }
}