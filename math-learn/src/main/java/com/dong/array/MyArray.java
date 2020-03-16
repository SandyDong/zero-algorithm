package com.dong.array;

/**
 *
 * 数组的插入操作以及删除操作
 */
public class MyArray {

    private int[] arr;

    private int size;

    public MyArray(int size){
        this.size = size;
        arr = new int[size];
    }

    /**
     * 往数组指定的位置插入值
     * @param index  索引
     * @param value  值
     */
    public void insertData(int index,int value){

    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr.length);
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr.length);
    }
}
