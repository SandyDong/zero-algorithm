package com.dong.Thread;

/**
 * @author dongwenqiang
 *
 */
public class RealizeRunnable extends  TestClass implements Runnable{
    public static void main(String[] args) {
//        new RealizeRunnable().print();//调用父类的方法
        RealizeRunnable realizeRunnable = new RealizeRunnable();

        new Thread(realizeRunnable).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        realizeRunnable.print();
        //由于realizeRunnable该类已经继承一个父类，不能再直接继承thread类，所以只能实现runnable接口

    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程在被执行!");
    }
}

class  TestClass{

    public void print(){
        System.out.println("在父类中该方法被执行!");
    }
}


/**
 * 上述程序执行的可能结果有以下两种：
 *在父类中该方法被执行!
 *线程在被执行!
 *
 *线程在被执行!
 *在父类中该方法被执行!
 *
 */
