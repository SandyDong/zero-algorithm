package com.dong.jdkapi;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("aa",null);
        tempMap.put("bb","22");
        tempMap.put("cc",null);
        tempMap.put("aa","66");

        Collection<Object> values = tempMap.values();
        System.out.println(values.size());
        Iterator<Object> iterator = values.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
