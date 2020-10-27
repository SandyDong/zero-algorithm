package com.dong.niuke;

import java.util.BitSet;
import java.util.Scanner;

/**
 * @author dongwenqiang
 * @description: 如果统计的个数相同，则按照ASCII码由小到大排序输出 。如果有其他字符，则对这些字符不用进行统计。
 * <p>
 * 实现以下接口：
 * 输入一个字符串，对字符中的各个英文字符，数字，空格进行统计（可反复调用）
 * 按照统计个数由多到少输出统计结果，如果统计的个数相同，则按照ASCII码由小到大排序输出
 * 清空目前的统计结果，重新统计
 * 调用者会保证：
 * 输入的字符串以‘\0’结尾。
 *
 */
public class Test09 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String inputParam = scanner.next();

        char[] originChar = inputParam.toCharArray();

        char[]  tempChar = new char[128];

        for (int i = 0; i < originChar.length; i++) {
            tempChar[(int)originChar[i]]++;
        }
        //寻找字符个数最多的字符对应的ascii码值
        int max = 0;
        for (int i = 0; i < tempChar.length; i++) {
            if(max < tempChar[i]){
                max = i;
            }
        }
        //按照字符次数从多到少进行遍历输出
        StringBuilder stringBuilder = new StringBuilder();
//        while(max != 0){
            for (int i = 0; i < inputParam.length(); i++) {
                if(inputParam.charAt(i)==max){
                    stringBuilder.append(inputParam.charAt(i));
                }
                max -- ;
            }
//        }

        System.out.println(stringBuilder.toString());

    }
}
