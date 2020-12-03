package com.dong.array;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String>  dataList = new ArrayList<String>();
        System.out.println(dataList.get(0));

        /**
         *模拟下报错场景
         *Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
         * 	at java.util.ArrayList.rangeCheck(ArrayList.java:657)
         * 	at java.util.ArrayList.get(ArrayList.java:433)
         * 	at com.dong.array.TestList.main(TestList.java:9)
         */
    }
}
