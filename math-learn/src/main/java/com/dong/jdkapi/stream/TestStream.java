package com.dong.jdkapi.stream;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * 测试流stream
 */
public class TestStream {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        List<String> collect = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());


        collect.forEach(System.out::println);
        /*for (String s : collect) {
            System.out.println(s);
        }
*/
        System.out.println("--------------------------分界线--------------------------------------");
        Random random = new Random();
        IntStream limit = random.ints().limit(10);
        limit.forEach(System.out::println);
    }
}
