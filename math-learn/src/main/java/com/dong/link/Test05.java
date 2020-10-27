package com.dong.link;

import java.util.Scanner;

/**
 *
 * 字符串分割--华为
 */
public class Test05 {
    public static void main(String[] args) {
        //获取输入的类容
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            //获取输入的字符串
            String nextStringData = scanner.next();
            if(nextStringData.length() < 8 ){
                //统计补零的个数
                int  extengZero = 8 - nextStringData.length();
                for (int i = 0; i < extengZero ; i++) {
                    StringBuilder appendStringOne = new StringBuilder(nextStringData).append("0");
                    System.out.println(appendStringOne.toString());
                }
            }else if(nextStringData.length() == 8){
                System.out.println(nextStringData);
            }else if(nextStringData.length() > 8){
                for (int i = 0; i <nextStringData.length() ; i++) {
                    StringBuilder stringBuilder = new StringBuilder();
                    if( i % 7!=0){
                        stringBuilder.append(nextStringData.charAt(i));
                    }
                }
            }
        }
    }
}
