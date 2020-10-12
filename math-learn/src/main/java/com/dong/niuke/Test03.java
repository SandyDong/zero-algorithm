package com.dong.niuke;

import java.util.Scanner;

/**
 * 题目描述：写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 * <p>
 * 输入描述：第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。
 * <p>
 * 输出描述：输出输入字符串中含有该字符的个数。
 * <p>
 * 代码已通过案例测试
 */
public class Test03 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        //输入参数一 忽略大小写
        String data1 = sc.nextLine().toLowerCase();
        //输入参数二 获取输入的单个字符
        char charData = sc.nextLine().charAt(0);

        Character.toLowerCase(charData);

        int countNum = 0;

        if (null != data1 && data1.length() > 0) {
            for (int i = 0; i < data1.length(); i++) {
                if (charData == data1.charAt(i)) {
                    countNum++;
                }
            }
        } else {
            countNum = 0;
        }
        System.out.println(countNum);
    }
}
