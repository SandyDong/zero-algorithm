package com.dong.design_pattern_simple.impl;

import com.dong.design_pattern_simple.Car;

public class BmwImpl implements Car {
    @Override
    public void drink(String str) {
        System.out.println("宝马需要汽油"+str);
    }

    @Override
    public void run(String str) {
        System.out.println("宝马能跑很久!"+str);
    }
}
