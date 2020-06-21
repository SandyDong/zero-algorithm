package com.dong.niuke;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String  str = scanner.next();
        System.out.println(countNum1(str));
    }

    /**
     * 统计字符串中不同的个数(此适用的场景是 aabbcc，字母是具有连续性的的场景，不使用不同字母互相交叉的场景)
     *
     * @param str
     * @return
     */
    public static int countNum(String str) throws Exception{


        byte[] bytes = str.getBytes();

        if (bytes.length==0){
            return 0;
        }
        if(bytes[0] <= 0 ||bytes[0] >= 127){
            throw new Exception("输入的字符串不合法!");
        }
        //去重后数组的初始大小
        int arrLength = 0 ;
        for (int i = 1; i < bytes.length; i++) {
            if(bytes[i] <= 0 ||bytes[i] >= 127){
                throw new Exception("输入的字符串不合法!");
            }
            if (bytes[i]!=bytes[arrLength]){
                arrLength++;
                bytes[arrLength] = bytes[i];
            }
        }

        //过滤不是属于ASCII(0-127)范围的字符串
        int countValid = 0;
        for (int i = 0; i < arrLength+1; i++) {
            if(bytes[i]>=0 && bytes[i] <= 127){
                countValid++;
            }
        }
        return  countValid ;
    }

    /**
     * 统计字符串中不同的个数(需要用java的api完成,利用map的key唯一性做去重功能)
     *
     * @param str
     * @return
     */
    public static int countNum1(String str) throws Exception{
        if (str != null){
            Map<Object,Object>  dataMap = new HashMap<Object,Object>();
            byte[] bytes = str.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                dataMap.put(bytes[i],new Object());
            }
            return dataMap.size();
        }
       return 0;
    }
}
