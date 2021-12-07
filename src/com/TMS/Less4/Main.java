package com.TMS.Less4;

public class Main {

    public static void main(String[] args) {
            Mants mants = Mants.APR;
              switch (mants){
                  case APR:
                      System.out.println("SPRING");
                      break;

                  case DEC:
                      System.out.println("WINTER");
                      break;

              }

        AR ar = new AR(new int[]{1, 4, 6, 8, 3, 0});
//        System.out.println( ar.SearchMin());
        System.out.println(ar.SearchMax());
//        ar.sort();
        System.out.println(ar);

        ar.search(6);

        User user = new User("Evgeniy", "kotv", 38);
        user.nameLastname();
        user.age1();
        user.Dan();
        user.Dan("ddddddd");

        user.getadres("Minsk", "RB");


    }


}
