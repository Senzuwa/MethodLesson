package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("nakabayashi","suzuki", "honda","mizuhara","kobayashi");

        names.stream().map(String::toUpperCase).forEach(System.out::println);
        names.stream().map(String::toLowerCase).forEach(System.out::println);

        List<String> SortedResult = names.stream().sorted().toList();
        SortedResult.forEach(System.out::println);

        long count = names.stream().filter(List.of("honda","mizuhara")::contains).count();
        System.out.println(count);

        boolean hasbayashi = names.stream().anyMatch(List.of("kobayashi")::contains);
        System.out.println(hasbayashi);



    }



}