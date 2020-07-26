package com.dong.basic_learn;

import java.lang.reflect.Field;

public class Knowledge_01 {
    public static void main(String[] args) {
        Person aa = new Person("aa", 22);
        try {
            Field name = aa.getClass().getDeclaredField("name");
            name.setAccessible(true);
            try {
                name.set(aa,"cc");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                System.out.println("运行时通过反射修改对象的私有属性值失败!");
            }
        } catch (NoSuchFieldException e) {
            System.out.println("反射获取私有属性字段对象异常");
        }finally {
            System.out.println(aa.getName());
        }

        aa.setName("dd");
        System.out.println(aa.getName());
    }
}


class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}