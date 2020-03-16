package com.dong.map;

import java.util.HashMap;

/**
 * hashmap测试
 */
public class Test01 {
    public static void main(String[] args) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("aa",null);
        stringObjectHashMap.put("bb",null);
        stringObjectHashMap.put(null,"aa");
        stringObjectHashMap.put(null,null);
        System.out.println(stringObjectHashMap);
        System.out.println(stringObjectHashMap.get("aa"));
        System.out.println(stringObjectHashMap.get("bb"));
        System.out.println(stringObjectHashMap.get(null));
    }
}
