package com.dong.jdkapi.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter {
    public static void main(String[] args) {
        List<PersonDemo> testList = new ArrayList<PersonDemo>();

        for (int i = 0; i < 3; i++) {
            testList.add(new PersonDemo("wang" + i, i + 20));
        }

        for (PersonDemo personDemo : testList) {
            System.out.println(personDemo.getName() + "====>" + personDemo.getAge());
        }
//        policyFileSignList.removeIf(p -> StringUtils.equals("precheck", p.getFileCode()));

        testList.removeIf(p -> "wang1".equals(p.getName()));

        System.out.println("=============================================");

        for (PersonDemo personDemo : testList) {
            System.out.println(personDemo.getName() + "====>" + personDemo.getAge());
        }
        System.out.println("=============================================");
        testList.forEach(PersonDemo ->
                System.out.println(PersonDemo.getName() + "====>" + PersonDemo.getAge())
        );
        System.out.println("=============================================");

        List<PersonDemo> testTempList = new ArrayList<PersonDemo>();

        for (int i = 10; i < 12; i++) {
            testTempList.add(new PersonDemo("wang" + i, i + 20));
        }
        //通过stream()流进行过滤操作。
        testTempList.stream().
                filter(personDemo -> "wang10".equals(personDemo.getName())).
                forEach(personDemo -> {
                    System.out.println(personDemo.getName() + "==" + personDemo.getAge());
                });

        System.out.println("=====================================================================================");

        List<PersonDemo> collect = testTempList.stream().filter(personDemo -> "wang10".equals(personDemo.getName())).collect(Collectors.toList());

        collect.forEach(personDemo -> {
            System.out.println(personDemo.getName() + "=====>" + personDemo.getAge());
        });

        System.out.println("*****************************************************************************************************************");
        List<PersonDemo> testMiddList = new ArrayList<PersonDemo>();

        for (int i = 30; i < 35; i++) {
            testMiddList.add(new PersonDemo("wang" + i, i + 20));
        }

        testMiddList = testMiddList.stream().filter(personDemo ->
                "wang32".equals(personDemo.getName()) || "wang31".equals(personDemo.getName()) || "wang30".equals(personDemo.getName())
        ).collect(Collectors.toList());

//        testMiddList = testMiddList.stream().filter(personDemo -> "wang32".equals(personDemo)).collect(Collectors.toList());

        testMiddList.forEach(personDemo -> {
            System.out.println(personDemo.getName()+"==="+personDemo.getAge());
        });
        System.out.println("******************************迭代器遍历**********************************************");

        Iterator<PersonDemo> iterator = testMiddList.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getName().equals("wang31")){
                iterator.remove();
            }
        }

        testMiddList.forEach(personDemo -> {
            System.out.println(personDemo.getName()+"==="+personDemo.getAge());
        });


     /*   testMiddList.stream().filter(personDemo ->
                "wang30".equals(personDemo.getName()));*/


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