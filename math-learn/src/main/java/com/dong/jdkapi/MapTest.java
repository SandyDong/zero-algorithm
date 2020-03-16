package com.dong.jdkapi;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

/**
 *  以下测试需要jdk版本在8及8以上jdk版本
 * 测试TreepMap数据结构排序功能(默认按照key值升序排序)
 */
public class MapTest {

    public static void  sortOrderById(Map<Integer,String> map){
        System.out.println("**********排序开始*********");
        TreeMap<Integer, String> integerTreeMap = new TreeMap<Integer, String>();

        /***************lambda表达式使用如下************/
        map.entrySet().forEach(entity-> System.out.println(entity.getKey())

                );
        map.forEach((k,v)-> System.out.println("v="+k+",v="+v));

        map.forEach((k,v)-> integerTreeMap.put(k,v));

        integerTreeMap.forEach((k,v)-> System.out.println("键值:"+k+"值:"+v));

        System.out.println("---------------------------------------------");

        /******************java8特性使用如下*************************/
        integerTreeMap.forEach(new BiConsumer<Integer,String>(){
            @Override
            public void accept(Integer integer, String s) {
                System.out.println("integer-key-->"+integer+"string-sss-->"+s);
            }
        });

    }

    public static void main(String[] args) {
        Map<Integer,String>  dataMap = new HashMap<>();
        dataMap.put(22,"aa");
        dataMap.put(33,"bb");
        dataMap.put(13,"bb");
        dataMap.put(77,"bb");
        dataMap.put(99,"bb");
        dataMap.put(30,"bb");

        MapTest.sortOrderById(dataMap);
    }
}
