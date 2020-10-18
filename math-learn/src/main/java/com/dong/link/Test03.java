package com.dong.link;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * fAdDAkBbBq
 * 4
 *
 * AbCdeFG
 * 3
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //获取第一个字符串
        String strData = in.nextLine();
        //长度值
        String s = in.nextLine();

        int k = Integer.parseInt(s);

        char[] chars = strData.toCharArray();

        int[] asciValue = new int[128];
        //记录字符出现的次数
        int maxAscii = 0;
        for (int i = 0; i < chars.length; i++) {
            asciValue[(int) chars[i]]++;
            if(maxAscii < (int)chars[i]){
                maxAscii = (int)chars[i];
            }
        }
        System.out.println("最大ascii码值=="+maxAscii);
        //记录临时要打印的数据
        int tempValue = 0;
        //记录打印的ascii码值
        int tempAscii = 0;

        if(k <= chars.length){
            for (int i = 0; i < asciValue.length; i++) {
                if (asciValue[i] != 0) {
                    tempValue+=asciValue[i];
                    //此时找到第k小的ascii码值
                    if (tempValue == k) {
                        tempAscii = i;
                        break;
                    }
                }
            }
        }else{
            tempAscii = maxAscii;
        }

        for (int i = 0; i < chars.length; i++) {
            if((int)chars[i] == tempAscii){
                System.out.println(i);
                break;
            }
        }

    }
}


