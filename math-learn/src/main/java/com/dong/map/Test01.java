package com.dong.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @description hashmap测试(可以空键，可以空值)
 * @author 董文强
 * @date 2020/07/23
 */
public class Test01 {
    public static void main(String[] args) {
        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("aa",null);
        dataMap.put("bb",null);
        dataMap.put(null,"aa");
        dataMap.put(null,null);
        System.out.println(dataMap);
        System.out.println(dataMap.get("aa"));
        System.out.println(dataMap.get("bb"));
        System.out.println(dataMap.get(null));
        System.out.println("===============快捷键测试=======================");



        Iterator<Object> iterator = dataMap.values().iterator();

    }
}
