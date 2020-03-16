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
            for (int i = 0; i < aa.length -1 ; i++) {
                for (int j = 0; j <aa.length-i-1 ; j++) {
                    //中间存储变量
                    int temp = 0;
                    if (aa[j]>aa[j+1]){
                        temp = aa[j];
                        aa[j] = aa[j+1];
                        aa[j+1] = temp;
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
                //每一轮都去比较,该参数与其它参数进行比较
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

    /**
     * 优化版本1  如果发现提前排好顺序了，可以提前终止程序的执行
     */
    private static int[] BubbleSortDesc1(int[] aa)throws Exception{
        if (null == aa){
            throw new Exception("当前数组输入的值为空!");
        }
        for (int i = 0; i < aa.length -1; i++) {
            //定义一个是否已经排好序标识
            boolean isSorted = true;
            for (int j = 0; j <aa.length-1-i ; j++) {
                int temp = 0;
                if (aa[j]>aa[j+1]){
                    temp = aa[j];
                    aa[j] = aa[j+1];
                    aa[j+1] = temp;
                    //设置已经排好序标识
                    isSorted = false;
                }
            }
            if (isSorted){
                //剩下比较轮次无需再比较
                break;
            }
        }
        return aa;
    }
}
