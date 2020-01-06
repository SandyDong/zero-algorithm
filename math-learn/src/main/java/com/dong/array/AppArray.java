package com.dong.array;

/**
 * 引用数据类型
 * 数组的操作 增加  删除  修改  查询
 */
public class AppArray {

    public static void main(String[] args) {
        int aa[] = new int[5];
        aa[0] = 1;
        aa[1] = 2;
        aa[2] = 3;
        //数组查询 直接通过数组下标访问 时间复杂度为0(1)
        System.out.println(aa[0]+"--"+aa[1]+"--"+aa[2]);
        //数组修改 直接通过数组下标修改 时间复杂度为0(1)
        aa[0] = 11;
        System.out.println("数组首位元素修改后的值为:"+aa[0]);
        System.out.println();
        //数组插入
        /**
         * 数组插入可能会有如下情况（存量数据情况）
         * 中间插入（也包含在首位元素未知插入，插入前也需要判断当前数组位置是否够用,不够用的话需要扩容插入）
         * 尾部插入（尾部插入前要判断当前数组位置是否够用，不够用的话需要扩容插入）
         * 超范围插入（该情况就是上面插入数据所遇到的一种实际情况）
         */

        //数组删除

    }
}
