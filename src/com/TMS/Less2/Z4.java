package com.TMS.Less2;

import java.util.Scanner;

public class Z4 {
    public static void main(String[] args) {
        //                  Задача 4

        Scanner sc = new Scanner(System.in);
        int ccc = sc.nextInt();
        int vvv = sc.nextInt();
        int sum = 0;
        for (int i = ccc; i < vvv; i++) {
            sum = sum + i;
        }
        if (sum % 3 == 0) {
            System.out.println(sum);
        }

    }
    }
