package com.dong.zifuchuan;

/**
 * 反转字符串
 * 题目要求：
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符
 *
 * 例如：
 *  输入：["h","e","l","l","o"]
 *  输出：["o","l","l","e","h"]
 */

public class Test01 {
    public static void main(String[] args) {
        System.out.println("***************反转字符串测试*************");
        char[] chars={'h','e','l','l','o'};
        reverseString(chars);

        char[] chars2={'h','e','l','a',' ','l','o'};
        System.out.println("****************************************");
//        char[] chars3= {'A',' ','m',"a","n",","," ","a"," ","p","l","a","n",","," ","a"," ","c","a","n","a","l",":"," ","P","a","n","a","m","a"};
        reverseString3(chars2);
        for (char tempStr : chars2) {
            System.out.println(tempStr);
        }

    }

    /**
     * 采用倒序遍历输出可以输出结果，但是不满足题意要求
     * @param charBuff
     */
    public static void reverseString(char[] charBuff){
        System.out.println(charBuff.length);
        char[]  newStrBuf =new char[charBuff.length];
        for (int i = charBuff.length - 1 ; i >= 0 ; i--) {
            System.out.println(i+"===>"+charBuff[i]);
            newStrBuf[charBuff.length-1-i] = charBuff[i];
        }
        System.out.println("*********************************");
        for (char str : newStrBuf) {
            System.out.println(str);
        }
    }

    /**
     * 借用中间变量的方式遍历输出
     * 不用判断数组长度是否奇偶数
     * @param charBuff
     */
    public static void  reverseString2(char[] charBuff){
        int aa = charBuff.length % 2;
        //数组的长度是偶数
        if(aa == 0){
            for (int i = 0; i < charBuff.length/2 ; i++) {
                commonExchange(charBuff,i);
            }
        //数组的长度是奇数
        }else{
            for (int i = 0; i < charBuff.length/2; i++) {
                commonExchange(charBuff,i);
            }
        }
    }


    private static void commonExchange(char[] charBuff,int i){
        char tempStr = charBuff[i];
        charBuff[i] = charBuff[charBuff.length-1-i];
        charBuff[charBuff.length-1-i] = tempStr;
    }

    /**
     * 执行测试用例通过
     * @param charBuff
     */
    public static void  reverseString3(char[] charBuff){
        for (int i = 0; i < charBuff.length/2 ; i++) {
            char tempStr = charBuff[i];
            charBuff[i] = charBuff[charBuff.length-1-i];
            charBuff[charBuff.length-1-i] = tempStr;
        }
    }
}
