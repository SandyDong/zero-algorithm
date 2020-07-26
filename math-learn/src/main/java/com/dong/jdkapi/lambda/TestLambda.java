package com.dong.jdkapi.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description  测试lambda表达式新特性
 * @author       dongwenqiang
 * @date         2020/07/22
 */
public class TestLambda {

    public static void main(String[] args) {

        //lambda表达式开启线程
        new Thread(()->{
            System.out.println("线程开始执行!");
        }).start();

        List<String> list = Arrays.asList("hello","worild","hello world");

        list.forEach(ss->{
            System.out.println(ss.toUpperCase());
        });

        List<String>  tempList = new ArrayList<>();

        list.forEach(ss->{
            tempList.add(ss.toUpperCase());
        });

        System.out.println("==============================");

        tempList.forEach(item->{
            System.out.println(item);
        });

    }
}
