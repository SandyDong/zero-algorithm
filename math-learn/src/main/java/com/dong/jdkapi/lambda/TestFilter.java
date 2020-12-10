package com.dong.jdkapi.lambda;

import java.util.*;
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
            System.out.println(personDemo.getName() + "===" + personDemo.getAge());
        });
        System.out.println("******************************迭代器遍历**********************************************");

        Iterator<PersonDemo> iterator = testMiddList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals("wang31")) {
                iterator.remove();
            }
        }

        testMiddList.forEach(personDemo -> {
            System.out.println(personDemo.getName() + "===" + personDemo.getAge());
        });

        long count = testMiddList.stream().count();
        System.out.println(count);

     /*   testMiddList.stream().filter(personDemo ->
                "wang30".equals(personDemo.getName()));*/
        System.out.println("******************************lambda表达式新取值**********************************************");
        //取出persondemo中的年龄值
        List<Integer> ageList = testMiddList.stream().map(personDemo -> personDemo.getAge()).collect(Collectors.toList());
        ageList.stream().forEach(age -> {
            System.out.println("获取所有的用户年龄:" + age);
        });
        //对取出的值进行去重
        List<Integer> ageDisList = testMiddList.stream().map(personDemo -> personDemo.getAge()).distinct().collect(Collectors.toList());
        ageDisList.stream().forEach(age -> {
            System.out.println("获取所有的用户年龄(去重后的年龄):" + age);
        });
        //list数据转换存到map数据结构中(key值为person中的name值,value存放的数据对象)
        Map<String, PersonDemo> personDemoMap = testMiddList.stream().collect(Collectors.toMap(PersonDemo::getName, personDemo -> personDemo));

        Iterator<PersonDemo> valuesIterator = personDemoMap.values().iterator();
        while (valuesIterator.hasNext()) {
            PersonDemo personDemo = valuesIterator.next();
            System.out.println(personDemo.getName() + "===" + personDemo.getAge());
        }

        //list数据转换存到map数据结构中(key,value都为person对象中的属性值)
        Map<String, Integer> personDataMap = testMiddList.stream().collect(Collectors.toMap(PersonDemo::getName, personDemo -> personDemo.getAge()));
        Iterator<Integer> personDataIterator = personDataMap.values().iterator();
        while (personDataIterator.hasNext()) {
            Integer ageData = personDataIterator.next();
            System.out.println(ageData);
        }

        //list数据转换存到map数据结构中(key为person对象中的属性值,value为person对象,如遇到值冲突，则取最新的值,可以避免值冲突的现象)
        Map<String, PersonDemo> newPersonMap = testMiddList.stream().
                collect(Collectors.toMap(PersonDemo::getName, personDemo -> personDemo, (oldValue, newValue) -> newValue));
        //按照年龄值大小进行排序
        testMiddList.sort((personDemo1, personDemo2) -> personDemo2.getAge().compareTo(personDemo1.getAge()));

        testMiddList.forEach(personDemo -> {
            System.out.println(personDemo.getName()+"===>"+personDemo.getAge());
        });
    }
}

class PersonDemo {

    private String name;

    private Integer age;

    public PersonDemo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}