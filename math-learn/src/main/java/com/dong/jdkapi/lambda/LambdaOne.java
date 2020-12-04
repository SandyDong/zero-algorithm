package com.dong.jdkapi.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class LambdaOne {
    public static void main(String[] args) {
        List<StudentOne> studentOneList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            studentOneList.add(new StudentOne("aa" + i, 20 + i));
        }
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class StudentOne {

    private String name;

    private int age;

}