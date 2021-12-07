package com.TMS.Less3;

import java.util.Scanner;

public class Less3 {

    public static void main(String[] args) {

//     Задача 1
        Scanner Sw = new Scanner(System.in);
        int n = Sw.nextInt();
        int[] Fib = new int[n];
        Fib[0] = 0;
        Fib[1] = 1;
        for (int i = 2; i < Fib.length; ++i) {
            Fib[i] = Fib[i - 1] + Fib[i - 2];
            System.out.println(Fib[i]);

            //        Задача 2

            int[] mas = {1, 5, 3, 7, 2, 6, 2};
            int max = mas[0], min = mas[0];
            for (int j = 0; j < mas.length; j++) {
                if (mas[j] > max)
                    max = mas[j];
                if (mas[j] < min)
                    min = mas[j];
            }
            System.out.println("Максимальное число: " + max);
            System.out.println("Минимальное число: " + min);
            System.out.println("Сумма:" + max + min);


            //        Задача 3.

            int[] mas2 = {1, 5, 3, 7, 2, 6, 2, 4, 7};
            int sum = 0;
            int sum1 = 0;
            for (int l = 0; l < mas2.length; l++) {
                if (l % 2 == 0) {
                    sum += mas2[l];
                }
                if (l % 2 == 1) {
                    sum1 += mas2[l];
                }
            }
            System.out.println(sum1 - sum);

//               Задача 4
            int[] mas3 = {1, 5, 3, 7, 3, 6, 3, 4, 7};

            int a = 0;
            int d = 0;
            for (int s = 0; s < mas3.length; s++) {
                for (int j = 0; j < mas3.length - 1; j++) {
                    if (mas3[s] == mas3[j]) {
                        a = mas3[s];
                        d++;
                    }
                }
            }
            System.out.println("элемент " + a + " встречается " + d + " раз");
            d = 0;


        }
    }
}


