package com.dong.Thread;

/**
 * @author doongwenqiang
 * @description  测试currentThread方法
 */
public class CurrentThreadPrint {
    public static void main(String[] args) {
        CurrentThreadTestOne currentThreadTestOne = new CurrentThreadTestOne();

        Thread thread = new Thread(currentThreadTestOne);
        thread.setName("temp name");
        thread.start();
    }
}

class  CurrentThreadTestOne extends Thread{

    public CurrentThreadTestOne(){
        super();
        System.out.println("构造方法开始执行!");
        System.out.println("执行当前代码的线程名字==>"+Thread.currentThread().getName());
        System.out.println("获取当前线程对象的名字"+this.getName());
        System.out.println("构造方法结束执行!");

    }
    @Override
    public void run() {
        super.run();
        System.out.println("run方法开始执行!");
        System.out.println("执行当前代码的线程名字==>"+Thread.currentThread().getName());
        System.out.println("获取当前线程对象的名字"+this.getName());
        System.out.println("run方法结束执行!");
    }
}
//        上述程序执行结果如下：

//        构造方法开始执行!
//        执行当前代码的线程名字==>main
//        获取当前线程对象的名字Thread-0
//        构造方法结束执行!
//        run方法开始执行!
//        执行当前代码的线程名字==>temp name
//        获取当前线程对象的名字Thread-0
//        run方法结束执行!
