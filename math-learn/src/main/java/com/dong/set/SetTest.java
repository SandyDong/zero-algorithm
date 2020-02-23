package com.dong.set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * set数据结构测试
 *
 */
public class SetTest {
    public static void main(String[] args) {
        System.out.println("----------set数据结构测试-------------");

        Set<String>  setData = new HashSet<String>();
        setData.add("aa");
        setData.add("bb");
        setData.add("aa");
        System.out.println(setData.size());
    }
}
