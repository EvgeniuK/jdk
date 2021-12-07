package com.TMS.Less5;

import java.util.Arrays;

public class Director extends Employee {

    private Worker[] workers;

    public Director(String name, String Lastname, DiWo stat, int stag, int basestavka) {
        super(name, Lastname, stat, stag, basestavka);
    }


    @Override
    public String toString() {
        return "Director{" + nameLastname() + " salary = " + getSalary() + " stag = " + stag + " stat = " + stat  + "}"
                + " Workers = " + Arrays.toString(workers);
    }
        public void addWorker(Worker[] worker){
        workers = worker;
}

    @Override
    public void returnSalary() {
        this.setSalary (basestavka * stag * basestavka* workers.length);
    }
}
