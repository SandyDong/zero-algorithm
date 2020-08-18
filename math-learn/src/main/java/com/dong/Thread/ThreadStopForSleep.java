package com.dong.Thread;

/**
 * @author dongwq
 * @description 睡眠情况下停止线程
 */
public class ThreadStopForSleep {
    public static void main(String[] args) {
        MyThreadForSleepOne myThreadForSleepOne = new MyThreadForSleepOne();
        myThreadForSleepOne.start();
        try {
            myThreadForSleepOne.sleep(3000);
        //执行当前代码块的线程开始停止(线程中止,for循环打印不会停止)
            myThreadForSleepOne.interrupt();
            System.out.println("当前main线程的状态是否中止==>"+myThreadForSleepOne.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /***
         * 执行结果如下图:
         * .
         * .
         * .
         * 92
         * 93
         * 94
         * 95
         * 96
         * 97
         * 98
         * 99
         * java.lang.InterruptedException: sleep interrupted
         *
         *
         *
         */

    }
}

class MyThreadForSleepOne extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("start---测试异常场景下停止线程!");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
