package com.dong.jdkapi.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 测试流stream
 */
public class TestStream {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        List<String> collect = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());


        collect.forEach(System.out::println);
        /*for (String s : collect) {
            System.out.println(s);
        }
*/
     /*   Random random = new Random();
        IntStream limit = random.ints().limit(10);
        limit.forEach(System.out::println);*/

        List<String> listData = new ArrayList<String>();
        listData.add("aa");
        listData.add("bb");
        listData.add("cc");
//      Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。
        listData.forEach(System.out::println);

    }
}
