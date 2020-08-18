package com.dong.ThreadSafeAndUnSafe;

/**
 * @author dongwq
 * @description 验证方法中的局部变量的线程安全性
 */
public class ThreadSafeForPrivateNum {
    public static void main(String[] args) {
        System.out.println("开始方法局部变量线程安全性测试.....");
        PrivateNumTestOne privateNumTestOne = new PrivateNumTestOne();
        MyPrivateNumThreadOne myPrivateNumThreadOne = new MyPrivateNumThreadOne(privateNumTestOne);
        myPrivateNumThreadOne.start();
        MyPrivateNumThreadTwo myPrivateNumThreadTwo = new MyPrivateNumThreadTwo(privateNumTestOne);
        myPrivateNumThreadTwo.start();
        System.out.println("结束方法局部变量线程安全性测试.....");

        /**
         * 测试结果如下：
         *
         * 开始方法局部变量线程安全性测试.....
         * aaa  set over
         * 结束方法局部变量线程安全性测试.....
         * 100
         * bbb  set over
         * 200
         *
         *
         */
    }
}

class MyPrivateNumThreadOne extends Thread {
    private PrivateNumTestOne privateNumTestOne;

    public MyPrivateNumThreadOne(PrivateNumTestOne privateNumTestOne) {
        this.privateNumTestOne = privateNumTestOne;
    }

    @Override
    public void run() {
        super.run();
        privateNumTestOne.addNum("aaa");

    }
}

class MyPrivateNumThreadTwo extends Thread {
    private PrivateNumTestOne privateNumTestOne;

    public MyPrivateNumThreadTwo(PrivateNumTestOne privateNumTestOne) {
        this.privateNumTestOne = privateNumTestOne;
    }

    @Override
    public void run() {
        super.run();
        privateNumTestOne.addNum("bbb");
    }
}

class PrivateNumTestOne {


    public synchronized void addNum(String tempString) {

        //测试的局部变量
        int resultNum = 0;

        try {
            if (tempString.equals("aaa")) {
                resultNum = 100;
                System.out.println("aaa  set over");
                Thread.sleep(3000);
            } else {
                resultNum = 200;
                System.out.println("bbb  set over");

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(resultNum);
    }

}
