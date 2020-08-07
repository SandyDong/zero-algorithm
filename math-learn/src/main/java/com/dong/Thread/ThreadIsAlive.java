package com.dong.Thread;

/**
 * @author dongwenqiang
 * @description 测试线程的IsAlive()方法,
 * Tests if this thread is alive. A thread is alive if it has been started and has not yet died.
 * 说明:
 * 方法isAlive（）的作用是测试线程是否处于活动状态。什么是活动状态呢？活动状态就是线程已经启动且尚未终止。
 * 线程处于正在运行或准备开始运行的状态，就认为线程是“存活”的
 * @date 2020/08/07
 */
public class ThreadIsAlive {
    public static void main(String[] args) throws InterruptedException {
        MyThreadTestOne myThreadTestOne = new MyThreadTestOne();
        System.out.println("begin==>" + myThreadTestOne.isAlive());
        myThreadTestOne.start();
        Thread.sleep(1000);
        System.out.println("end===>" + myThreadTestOne.isAlive());

        /***
         * System.out.println("end===>"+myThreadTestOne.isAlive());  end===>true
         * 注意：虽然在上面的示例中打印的值是true，但此值是不确定的。打印true值是因为mythread线程还未执行完毕，所以输出true
         *
         * 执行结果如下:
         * begin==>false
         * end===>true
         * run===>true
         *
         * 加上此段代码Thread.sleep(1000);执行的结果如下:
         * begin==>false
         * run===>true
         * end===>false 此处打印的值是false，证明线程myThreadTestOne在1s内执行完。因此状态就变成了关闭状态。
         */
    }
}

class MyThreadTestOne extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("run===>" + this.isAlive());
    }
}


