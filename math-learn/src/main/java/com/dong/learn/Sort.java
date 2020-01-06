package com.dong.learn;

/**
 * 排序算法
 */
public class Sort {


    /**
     * 经典冒泡排序算法
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("**********************排序算法开始执行************************");
        int aa[] = {2,3,1,6,0,1};
        System.out.println("***********升序算法开始执行********");
        aa = Sort.BubbleSort(aa);
        for (int i : aa) {
            System.out.println("*********数组中的元素为:"+i);
        }
        System.out.println("***********降序算法开始执行********");
        aa = Sort.BubbleSortDesc(aa);

        for (int i : aa) {
            System.out.println("*********数组中的元素为:"+i);
        }
        System.out.println("**********************排序算法结束执行************************");
    }

    /**
     * 从小到大排序
     * @param aa  参数为整形数组结构
     * @return
     */
    private static int[]  BubbleSort(int[] aa){

        if(aa != null){
            for (int i = 0; i < aa.length ; i++) {
                for (int j = i+1; j <aa.length ; j++) {
                    if (aa[i]>aa[j]){
                        int temp;
                        temp = aa[i];
                        aa[i] = aa[j];
                        aa[j] = temp;
                    }
                }    
            }
        }
     return aa;
    }

    /**
     * 从小到大排序
     * @param aa  参数为整形数组结构
     * @return
     */
    private static int[]  BubbleSortDesc(int[] aa){

        if(aa != null){
            for (int i = 0; i < aa.length ; i++) {
                for (int j = i+1; j <aa.length ; j++) {
                    if (aa[i]<aa[j]){
                        int temp;
                        temp = aa[i];
                        aa[i] = aa[j];
                        aa[j] = temp;
                    }
                }
            }
        }
        return aa;
    }
}
