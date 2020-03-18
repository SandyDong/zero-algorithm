package com.dong.design_pattern_simple.impl;

import com.dong.design_pattern_simple.Car;

/**
 * 汽车制造产品工厂
 */
public class CarProductFactory {
    public static Car makeCarByType(String type) throws Exception {

        if (null == type || "".equals(type)) {
            System.out.println("输入的车类型为空!");
            throw new Exception("输入的车类型为空");
        }
        if ("bmw".equals(type)) {
            return new BmwImpl();
        } else if ("benci".equals(type)) {
            return new BenCiImpl();
        } else {
            System.out.println("工厂生产不了该类型的车!");
            return null;
        }
    }

    public static void main(String[] args) throws Exception {
        Car bmw = CarProductFactory.makeCarByType("bmw");
        bmw.drink("111");
        bmw.run("222");

        Car benci = CarProductFactory.makeCarByType("benci");
        benci.run("333");
        benci.drink("555");
    }
}
