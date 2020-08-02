package com.dong.Thread;


/**
 * @author dongwenqiang
 * @description 验证线程执行的随机性
 * 1:使用随机数的形式，使得线程得到挂起的效果。
 * 从而表现出CPU执行哪个线程具有不确定性
 */
public class ValidateThreadRandom {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //执行异步的方式
        myThread.start();
        /**
         * start（）方法通知“线程规划器”此线程已经准备就绪，等待调用线程对象的run（）方法。
         * 这个过程其实就是让系统安排一个时间来调用Thread中的run（）方法，
         * 也就是使线程得到运行，启动线程，具有异步执行的效果
         */
//       myThread.run(); 执行同步的方式

        for (int i = 0; i < 10; i++) {
            int waitTime = (int) (Math.random() * 1000);
            try {
                Thread.sleep(waitTime);
                System.out.println("main=" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int waitTime = (int) (Math.random() * 1000);
            try {
                Thread.sleep(waitTime);
                System.out.println("run=" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
