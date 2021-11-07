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

           //        Задача 2

//        int[] mas = {1, 5, 3, 7, 2, 6, 2};
//        int max = mas[0], min = mas[0];
//        for(int i = 0; i < mas.length; i++) {
//            if(mas[i] > max)
//                max = mas[i];

//            if(mas[i] < min)
//                min = mas[i];
//        }
//        System.out.println("Максимальное число: " + max);
//        System.out.println("Минимальное число: " + min);



           //        Задача 3.

//        int[] mas2 = {1, 5, 3, 7, 2, 6, 2, 4, 7};
//        int sum = 0;
//        int sum1 = 0;
//         sum = mas2[0]+mas2[2]+mas2[4]+mas2[6]+mas2[8];
//        sum1 = mas2[1]+mas2[3]+mas2[5]+mas2[7];
//        System.out.println(sum1-sum);

//        Задача 4

           int[] mas3 = {1, 5, 3, 7, 3, 6, 3, 4, 7};
           int a = 0;
           int d = 0;
           for(int i = 0; i < mas3.length; i++){
               for(int j = 0; j < mas3.length-1; j++){
                   if (mas3[i] == mas3[j]){
                       a = mas3[i];
                       d++;
                   }
               }
               System.out.println("элемент "+a+" встречается "+d+" раз");
               d = 0;


           }
    }

}
