package com.dong.rawtype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class RawTypeTest {
    public static void main(String[] args) {

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person {

    private String name;

    private Integer age;

}

@NoArgsConstructor
@AllArgsConstructor
@Data
class Animal {
    private String type;

    private String size;
}