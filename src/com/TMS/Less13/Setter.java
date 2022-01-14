package com.TMS.Less13;

public class Setter implements Runnable {
    Setting setting;

    public Setter(Setting setting) {
        this.setting = setting;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            setting.put();
        }
    }
}
