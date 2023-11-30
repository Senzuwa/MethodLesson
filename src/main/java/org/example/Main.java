package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> MleagerList = List.of("nakabayashi","suzuki.T", "honda","mizuhara","kobayashi","suzuki.Y","setokuma");

        MleagerList.stream().map(String::toUpperCase).forEach(System.out::println);
        MleagerList.stream().map(String::toLowerCase).forEach(System.out::println);

        List<String> SortedResult = MleagerList.stream().sorted().toList();
        SortedResult.forEach(System.out::println);

        long count = MleagerList.stream().filter(List.of("honda","mizuhara")::contains).count();
        System.out.println(count);

        boolean hasbayashi = MleagerList.stream().anyMatch(List.of("kobayashi")::contains);
        System.out.println(hasbayashi);


    }



}