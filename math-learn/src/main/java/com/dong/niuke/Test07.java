package com.dong.niuke;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String  str = scanner.next();
        Map<Object,Object>  dataMap = new HashMap<Object,Object>();
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            dataMap.put(bytes[i],new Object());
        }
        System.out.println(dataMap.size());


    }
}
