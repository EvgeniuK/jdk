package com.TMS.Less10;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Family family1 = new Family("family1", true, 1000, Arrays.asList(
                new Child("child1", 10, true),
                new Child("child2", 15, false),
                new Child("child3", 20, true)
        ));

        Family family2 = new Family("family2", false, 5000, Arrays.asList(
                new Child("child4", 5, true),
                new Child("child2", 10, false),
                new Child("child3", 20, true)
        ));

        Family family3 = new Family("family3", true, 2000, Arrays.asList(
                new Child("child7", 2, true),
                new Child("child8", 10, false),
                new Child("child2", 15, true),
                new Child("child10", 20, true),
                new Child("child11", 20, true)
        ));

        List<Family> families = Arrays.asList(family1, family2, family3);


        System.out.println("________________");
        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(child -> child.getName().contains("2"))
                .forEach(System.out::println);

        System.out.println("________________");
        families.stream()
                .filter(family -> family.getChildren().size() > 3)
                .forEach(System.out::println);

        System.out.println("________________");
        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(Child::isSex)
                .forEach(System.out::println);

        System.out.println("________________");
        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .forEach(child -> System.out.println(child.getName().toUpperCase()));


        System.out.println("________________");
        int a =
                families.stream()
                        .mapToInt(value -> value.getChildren().size())
                        .sum();
        System.out.println(a);


        System.out.println("________________");
        Map<String, Integer> map =
                families.stream()
                        .collect(Collectors.toMap(Family::getName, value -> value.getChildren().size()));
        map.entrySet().forEach(System.out::println);


    }
}
