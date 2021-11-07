package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//      Задача 1

        int[] Fib = new int[7];

       Fib[0] = 0;
       Fib[1] = 1;
       for (int i = 2; i < Fib.length; ++i) {
           Fib[i] = Fib[i - 1] + Fib[i - 2];
           System.out.println(Fib[i]);

    }
    }

}
