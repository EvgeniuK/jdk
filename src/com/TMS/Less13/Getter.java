package com.TMS.Less13;

public class Getter implements Runnable {
    Setting setting;

    public Getter(Setting setting) {
        this.setting = setting;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            setting.get();
        }
    }
}
