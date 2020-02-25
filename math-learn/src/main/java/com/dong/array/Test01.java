package com.dong.array;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class Test01 {
    //采用双指针方法去做
    public static int deleteRepateCell(int[] a){
        if (a.length==0){
            return 0;
        }
        //去重后数组的初始大小
        int arrLength = 0 ;
        for (int i = 1; i < a.length; i++) {
            if (a[i]!=a[arrLength]){
               arrLength++;
               a[arrLength] = a[i];
            }
        }
        return  arrLength+1 ;
    }

    public static void main(String[] args) {
        int aa[] = {1,1,1,2,2,3,4};
        System.out.println(Test01.deleteRepateCell(aa));
    }
}
