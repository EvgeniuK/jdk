package com.TMS.Less2;
import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {

        //              Задача 1.1
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные:");
        String str = sc.nextLine();
        if (str.equals("a")|| str.equals("e")) {
            System.out.println(str + " гласная");
        }
        else if (str.equals("d") ){
            System.out.println( str + " согласная");
                    }
        else {
            System.out.println( str + " согласная");
        }

        
    }

}
