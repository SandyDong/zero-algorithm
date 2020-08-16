package com.dong.Thread;

/**
 * @author dongwenqiang
 * @description 获取线程的唯一标识ID
 */
public class ThreadGetId {
    public static void main(String[] args) {
        MyThreadGetId myThreadGetId = new MyThreadGetId();
        myThreadGetId.run();
        System.out.println("当前线程的名字是:" + Thread.currentThread().getName() +
                "当前线程的唯一标识ID为:" + Thread.currentThread().getId());

        /**
         * 执行结果如下：
         *
         *main===>run方法被调用............
         *当前线程的名字是:main当前线程的唯一标识ID为:1
         *
         */
    }
}

class MyThreadGetId extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName() + "===>run方法被调用............");
    }
}
