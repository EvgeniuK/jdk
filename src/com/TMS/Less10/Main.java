package com.TMS.Less10;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(0, 25, 4, 5, 1, 8, 6, 46);
        Integer var = number.stream().min(Integer::compare).get();
        System.out.println("Min : " + var);


        int[] intAr = {0, 25, 4, 5, 1, 8, 6, 46};
        IntStream intStream = Arrays.stream(intAr);
        OptionalInt optionalInt = intStream.max();
        int max = optionalInt.getAsInt();
        System.out.println("Max :  " + max);

        int a = Arrays.stream(intAr)
                .filter(value -> value % 2 == 0)
                .sum();
        System.out.println(a);


        IntStream stream = Arrays.stream(intAr, 5, intAr.length);
        stream.forEach(str -> System.out.print(str + " "));

    }


}



