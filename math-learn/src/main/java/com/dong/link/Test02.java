package com.dong.link;

import java.util.LinkedList;
import java.util.List;

/**
 * 链表基本操作
 *
 * todo 单链表完整操作未完成
 */
public class Test02 {
    public static void main(String[] args) {
        List<String>   linkList = new LinkedList<String>();
        linkList.add("aa");
        linkList.add("bb");
        for (int i = linkList.size() - 1; i >= 0; i--) {
            System.out.println(linkList.get(i));
        }
        System.out.println("*********************");
        for (int i = 0; i < linkList.size(); i++) {
            System.out.println(linkList.get(i));
        }
    }
}
