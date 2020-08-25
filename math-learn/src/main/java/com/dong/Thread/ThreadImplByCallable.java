package com.dong.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 通过callable实现多线程
 */
public class ThreadImplByCallable {

    public static void main(String[] args) {

        FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyCallable());

        new Thread(futureTask).start();

        try {
            Integer resultNum = futureTask.get();
            System.out.println("接收线程执行后的结果:" + resultNum);
        } catch (InterruptedException e) {
//            e.printStackTrace();
            System.out.println("执行出现异常信息1:" + e.getMessage());
        } catch (ExecutionException e) {
//            e.printStackTrace();
            System.out.println("执行出现异常信息2:" + e.getMessage());
        }
    }

}

/**
 * 使用callable的好处（相比较于使用runnable的好处）：
 * 1 接收线程返回的结果
 * 2 能够抛出异常信息
 */
class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        int tempNum = sum / 0;
        return sum;
    }
}
