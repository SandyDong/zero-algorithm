package com.dong.niuke;


/**
 * 题目：计算字符串最后一个单词的长度，单词以空格隔开。
 * 输入描述：一行字符串，非空，长度小于5000。
 * 输出描述：整数N，最后一个单词的长度。
 */
public class Test01 {
    public static void main(String[] args)throws Exception{
        System.out.println(getLastWordLength("XSUWHQ"));
    }

    public static int getLastWordLength(String data)throws Exception{
       if(data != null || !"".equals(data)){
           if (data.length() >= 5000){
                throw new Exception("当前输入字符串长度大于5000");
           }
           String[] word = data.split(" ");
           return word[word.length-1].length();
       }
        return 0;
    }
}
