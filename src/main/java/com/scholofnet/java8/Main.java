package com.scholofnet.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Leonan", "SQN", "Java 8", "Leonidas");

//        for (String stg : strings) {
//            System.out.println(stg);
//        }
//        System.out.println("LAMBDAS!!!");
//
//        strings.forEach(stg -> System.out.println(stg));

        List<String> l = strings.stream().filter(str -> str.startsWith("L")).collect(Collectors.toList());

        l.forEach(System.out::println);
    }

}
