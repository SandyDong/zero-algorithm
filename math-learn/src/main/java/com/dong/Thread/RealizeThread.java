package com.dong.Thread;


/**
 * @author dongwenqiang
 * @decription 实现多线程的方式
 * @date 2020/07/30
 */
public class RealizeThread {
    //实现多线程的方式
    public static void main(String[] args) {
        //主线程名字为main 该线程由jvm创建
        System.out.println(Thread.currentThread().getName());
        new ThreadOne().start();

        new Thread(new ThreadTwo()).start();
    }

}

class ThreadOne extends Thread {

    @Override
    public void run() {
        System.out.println("线程1执行");
    }
}

class ThreadTwo  implements Runnable{

    @Override
    public void run() {
        System.out.println("线程2执行");
    }
}