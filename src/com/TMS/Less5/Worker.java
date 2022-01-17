package com.TMS.Less5;

public class Worker extends Employee {

    private DiWo diWo;

    public Worker(String name, String Lastname, DiWo stat, int stag, int basestavka) {
        super(name, Lastname, stat, stag, basestavka);
    }

    public int getBasicSalary() {
        return DiWo.WORKER.getKof();
    }
    public String getWork(){
        return "Worker{" +
                nameLastname()+
                ", stat=" + stat +
                "salary=" + getSalary()+
                '}';
    }

    @Override
    public String toString() {
        return "Worker{" +
                nameLastname()+
                ", stat=" + stat +
                "salary=" + getSalary()+
                '}';
    }
}
