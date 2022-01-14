package com.TMS.Less13;

import java.util.ArrayList;
import java.util.Random;

class Setting {
    ArrayList<Integer> list = new ArrayList<>();

    public synchronized void get() {

        while (list.size() < 1) {
            try {
                System.out.println("поток изъятия остановлен ");
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            System.out.println("Remove " + list.get(list.size() - 1));
            Thread.sleep(60);
            list.remove(list.size() - 1);
            System.out.println("список " + list);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }


    public synchronized void put() {
        while (list.size() == 10) {

            try {
                System.out.println("поток добавления остановлен ");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

        Random random = new Random();
        try {
            int a = random.nextInt(5);
            list.add(a);
            System.out.println("добавили элемент " + a);
            System.out.println("список " + list);
            Thread.sleep(60);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();

    }
}