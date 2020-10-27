package com.dong.link;

/**
 *  一般解法
 * @description 输出如下图形
 * *****
 * ***
 * *
 * ***
 * *****
 */
public class Test06 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i = i - 2) {
            for (int m = 0; m < (5 - i) / 2; m++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int m = 0; m < (5 - i) / 2; m++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int n = 3; n <= 5; n = n + 2) {
            for (int m = 0; m < (5 - n) / 2; m++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            for (int m = 0; m < (5 - n) / 2; m++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
