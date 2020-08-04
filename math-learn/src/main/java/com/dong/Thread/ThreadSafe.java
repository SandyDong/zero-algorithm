package com.dong.Thread;

/**
 * @author dongwenqiang
 * @description 线程安全问题
 */
public class ThreadSafe {
    //开始测试线程安全问题
    public static void main(String[] args) {
        new ThreadTestA().start();
        new ThreadTestB().start();
    }
}

class LoginServlet {

    //用户户名
    private static String userName1;
    //用户密码
    private static String passWord1;

    //如下为非线程安全方法
    /*public static void post(String userName, String passWord) {

        userName1 = userName;

        if ("aa".equals(userName.trim())) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        passWord1 = passWord;

        System.out.println(userName1 + "==========>" + passWord1);
    }*/

    //加上同步关键字synchronized 进行同步，可以使线程安全。
    public synchronized static void post(String userName, String passWord) {

        userName1 = userName;

        if ("aa".equals(userName.trim())) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        passWord1 = passWord;

        System.out.println(userName1 + "==========>" + passWord1);
    }
}

class ThreadTestA extends Thread {

    @Override
    public void run() {
        super.run();
        LoginServlet.post("aa", "aa-01");
    }
}

class ThreadTestB extends Thread {
    @Override
    public void run() {
        super.run();
        LoginServlet.post("bb", "bb-01");
    }
}

/*
 * 执行结果如下：(如下是非线程安全导致的结果)
 * bb==========>bb-01
 * bb==========>aa-01
 *
 */

/*
 * 方法加上synchronized执行结果如下。加上同步锁，可以排序进行处理。
 * aa==========>aa-01
 * bb==========>bb-01
 *
 */

