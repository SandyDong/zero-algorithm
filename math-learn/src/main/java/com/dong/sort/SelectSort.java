package com.dong.sort;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        System.out.println("系统当前时间==>"+LocalTime.now());
        System.out.println("系统当前日期==>"+LocalDate.now());
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    /**
     *
     * @param arr  排序数组
     * @param size 数组大小
     */
    public void selectSort(int[] arr,int size){
        for (int i = 0; i < size -1; i++) {
            int temp = arr[i];
            for (int j = i; j < size -1  ; j++) {
                   if(arr[j] < arr[j]){

                   }
            }
        }
    }
}
