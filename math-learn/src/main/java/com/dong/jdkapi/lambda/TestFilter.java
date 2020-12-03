package com.dong.jdkapi.lambda;

import java.util.ArrayList;
import java.util.List;

public class TestFilter {
    public static void main(String[] args) {
        List<PersonDemo> testList = new ArrayList<PersonDemo>();

        for (int i = 0; i < 3; i++) {
            testList.add(new PersonDemo("wang"+i,i+20));
        }

        for (PersonDemo personDemo : testList) {
            System.out.println(personDemo.getName()+"====>"+personDemo.getAge());
        }
//        policyFileSignList.removeIf(p -> StringUtils.equals("precheck", p.getFileCode()));

        testList.removeIf(p -> "wang1".equals(p.getName()));

        System.out.println("=============================================");

        for (PersonDemo personDemo : testList) {
            System.out.println(personDemo.getName()+"====>"+personDemo.getAge());
        }
        System.out.println("=============================================");
        testList.forEach(PersonDemo ->
                        System.out.println(PersonDemo.getName()+"====>"+PersonDemo.getAge())
        );
    }
}

class PersonDemo {

    private String name;

    private int age;

    public PersonDemo(String name, int age) {
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