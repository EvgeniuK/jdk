package com.TMS.Less5;

public enum DiWo {
    DIRECTOR(5),
    WORKER(2);

    private int kof;

    DiWo(int kof) {
        this.kof = kof;
    }

    public int getKof() {
        return kof;
    }
}
