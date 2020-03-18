package com.dong.design_pattern_simple.impl;

import com.dong.design_pattern_simple.Car;

public class BenCiImpl implements Car {
    @Override
    public void drink(String str) {
        System.out.println("奔驰需要汽油!"+str);
    }

    @Override
    public void run(String str) {
        System.out.println("奔驰能跑很久!"+str);
    }
}
