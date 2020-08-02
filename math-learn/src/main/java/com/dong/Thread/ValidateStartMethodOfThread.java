package com.dong.Thread;

/**
 * @author dongwenqiang
 * @description 验证Thread中的start方法执行的顺序
 * 执行start方法的顺序不代表线程启动的顺序
 * 线程启动顺序与start()执行顺序无关
 */
public class ValidateStartMethodOfThread {
    public static void main(String[] args) {
        //创建多个线程对象，并都调用start()方法完成线程的调用
        MyThreadOne t1 = new MyThreadOne("1");
        MyThreadOne t2 = new MyThreadOne("2");
        MyThreadOne t3 = new MyThreadOne("3");
        MyThreadOne t4 = new MyThreadOne("4");
        MyThreadOne t5 = new MyThreadOne("5");
        MyThreadOne t6 = new MyThreadOne("6");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();


    }
}

class MyThreadOne extends Thread {

    private String numString;

    public MyThreadOne(String numString) {
        super();
        this.numString = numString;
    }


    @Override
    public void run() {
        System.out.println(numString);
    }
}
