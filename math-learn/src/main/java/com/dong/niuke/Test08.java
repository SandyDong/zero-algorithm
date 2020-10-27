package com.dong.niuke;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author dongwenqiang
 * @description 字符串逆序输出
 * eg: adc  处理完之后  cda
 */
public class Test08 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String  inputParam  = scanner.nextLine();

        String tempStr ="";
        for (int i = 0; i < inputParam.length(); i++) {
            tempStr = inputParam.substring(i,i+1)+tempStr;
        }
        System.out.println(tempStr);
    }
}
