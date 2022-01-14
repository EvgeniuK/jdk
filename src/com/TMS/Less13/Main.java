package com.TMS.Less13;

import java.util.ArrayList;
import java.util.Random;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Setting setting = new Setting();
        Getter getter = new Getter(setting);
        Setter setter = new Setter(setting);
        new Thread(getter).start();
        new Thread(setter).start();
        //   Thread thread = new Thread(new Add());
        //   thread.start();
        //   Thread.sleep(60);
        //   Thread thread1 = new Thread(new Get());
        //   thread1.start();


    }
}



