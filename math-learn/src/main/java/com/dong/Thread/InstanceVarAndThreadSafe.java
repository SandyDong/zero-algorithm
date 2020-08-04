package com.dong.Thread;

/**
 * @author dongwenqiang
 * @description 实例化变量和线程安全
 * @date 2020/08/03
 * 注意:自定义线程类中的实例变量针对其他线程可以有共享与不共享之分，这在多个线程之间进行交互时是很重要的一个技术点
 */
public class InstanceVarAndThreadSafe {

    public static void main(String[] args) {

        //开启三个线程执行测试(不共享变量测试)
        MyThreadTwo one = new MyThreadTwo("AA");
        MyThreadTwo two = new MyThreadTwo("BB");
        MyThreadTwo three = new MyThreadTwo("CC");

        one.start();
        two.start();
        three.start();

        //开启五个线程执行测试，访问都是同一个线程对象，因此实例变量count为共享变量
        MyThreadThree threadThree = new MyThreadThree();
        Thread aa = new Thread(threadThree, "AAA");
        Thread bb = new Thread(threadThree, "BBB");
        Thread cc = new Thread(threadThree, "CCC");
        Thread dd = new Thread(threadThree, "DDD");
        Thread ee = new Thread(threadThree, "EEE");

        aa.start();
        bb.start();
        cc.start();
        dd.start();
        ee.start();

    }


}


class MyThreadThree extends Thread {
    //定义一个成员变量
    private int count = 5;

    //非安全写法
    /*@Override
    public void run() {
        super.run();
        count--;
        System.out.println(Thread.currentThread().getName() + "===>" + count);
    }*/

    //安全写法
    @Override
    public synchronized void run() {
        super.run();
        count--;
        System.out.println(Thread.currentThread().getName() + "===>" + count);
    }
}

/**
 * 共享变量测试结果如下，如果不实现同步，则会出现线程安全问题。
 * <p>
 * BBB===>3
 * AAA===>3
 * CCC===>2
 * EEE===>0
 * DDD===>0
 * <p>
 * 分析线程安全原因：
 * 在某些JVM中，i--的操作要分成如下3步：
 * 1）取得原有i值。
 * 2）计算i-1。
 * 3）对i进行赋值。
 * 在这3个步骤中，如果有多个线程同时访问，那么一定会出现非线程安全问题。
 */

class MyThreadTwo extends Thread {

    //定义一个实例化变量
    private int count = 6;

    public MyThreadTwo(String name) {
        super();
        //设置线程别名
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            System.out.println(Thread.currentThread().getName() + "==>" + count);
            count--;
        }

    }
}

//测试结果如下
/***
 *
 * CC==>6
 * CC==>5
 * CC==>4
 * CC==>3
 * CC==>2
 * BB==>6
 * AA==>6
 * AA==>5
 * AA==>4
 * AA==>3
 * AA==>2
 * BB==>5
 * CC==>1
 * BB==>4
 * BB==>3
 * BB==>2
 * BB==>1
 * AA==>1
 *
 *
 *
 *
 */
