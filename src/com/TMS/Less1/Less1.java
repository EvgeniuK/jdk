package com.TMS.Less1;

import java.util.Scanner;

public class Less1 {
    public static void main(String[] args) {

        int a = 8;
        int b = 3;
        double res = a % b;
        System.out.println(res);
        System.out.println((55 + 9) % 9);

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:  ");
        int d = input.nextInt();
        System.out.println("Введите втрое число:  ");
        int m = input.nextInt();

        if (d > m) {
            System.out.println("большее число " + d);
        } else if (d < m) {
            System.out.println("большее число " + m);
        } else {
            System.out.println("числа равные");
        }
        if (d % m == 0) {
            System.out.println("числа четные ");
        } else {
            System.out.println("d/m- " + "целая часть  " + d / m + ", остаток " + (d % m));
        }
        System.out.println("тысяч " + d / 1000);
        System.out.println("сотен " + d / 100);
        System.out.println("десятков " + d / 10);
        System.out.println("единиц " + d % 10);

        char q = 12;
        System.out.println(q + 1);
        int r = (int) q;
        System.out.println(r);
        int y = 128;
        byte p = (byte) y;
        System.out.println(p);

        float h = 10;
        System.out.println(h / 0);


    }

}

