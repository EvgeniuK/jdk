package com.TMS.Less2;

import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {

        //                    Задача 5

        Scanner str = new Scanner(System.in);

        System.out.println("Введите количество чисел: ");

        int a = str.nextInt();

        int[] mas = new int[a];

        System.out.println("Введите числа в массив: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = str.nextInt();
        }
        int max = mas[0], min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max)
                max = mas[i];

            if (mas[i] < min)
                min = mas[i];
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
    }
}
