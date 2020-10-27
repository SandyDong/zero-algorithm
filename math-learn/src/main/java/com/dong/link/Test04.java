package com.dong.link;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author DJ027972
 * @description 明明的随机数 -- huawei
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            TreeSet set = new TreeSet();
            for (int i = 0; i < num; i++) {
                set.add(sc.nextInt());
            }
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
