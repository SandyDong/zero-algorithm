package com.dong.unusally.math;

/**
 * 判断一个整数是否是回文数
 *
 * @description 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 正例：121 | 1 | 12321
 * 反例：-121 != 121- | 100 != 001 1234 != 4321
 */
public class PalindRoom {
    public static void main(String[] args) {
        System.out.println("================开始回文数测试start===============");
        //结题思路
        /**
         * 1.先排除负数和被10整除的数
         * 2.反转整数的一半和整数比是否相等
         * 3.21反转，可以用21%10*10+21/10
         */
        System.out.println(isPalindrome(121));

    }

    public static boolean isPalindrome(int x) {
        // 负数、0、被10整除的数据
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        System.out.println(x % 10);
        // 取一半的数据比较
        // 1221 12321
        int reserveNum = 0;
        while (x > reserveNum) {
            reserveNum = x % 10 + reserveNum * 10;
            x = x / 10;
        }

        return x == reserveNum || x == reserveNum / 10;
    }
}
