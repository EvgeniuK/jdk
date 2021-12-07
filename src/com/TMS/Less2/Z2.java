package com.TMS.Less2;
import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
    //         Задача 2

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные:");
        String str = sc.nextLine();
        if (str.equals ( "dec" ) || str.equals ( "jan" ) || str.equals ( "feb" ) ) {
            System.out.println("зима");
        }
        else if (str.equals ( "mar" ) || str.equals ( "apr" ) || str.equals ( "may" ) ) {
            System.out.println("весна");
        }
        else if (str.equals ( "june" ) || str.equals ( "July" ) || str.equals ( "Aug" ) ) {
            System.out.println("лето");
        }
        else if (str.equals ( "sep" ) || str.equals ( "oct" ) || str.equals ( "nov" ) ) {
            System.out.println("осень");
        }
        else {
            System.out.println("ошибка");
        }
    }
}
