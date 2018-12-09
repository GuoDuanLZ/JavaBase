package com.wz.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStudy {

    public static void streamMap(){
        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        System.out.println(words.stream()
                .collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        streamMap();
    }
}
