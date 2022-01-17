package com.TMS.Less5;

public abstract class Employee extends Person {


    public int kof;
    protected DiWo stat;
    protected int stag;
    public int basestavka;
    private int Salary;

   public void returnSalary (){
       Salary = basestavka * stag * basestavka;
   }


    public Employee(String name, String Lastname, DiWo stat, int stag, int basestavka) {
        super(name, Lastname);
        this.stat = stat;
        this.stag = stag;
        this.basestavka = basestavka;

    }

    public int getKof() {
        return kof;
    }

    public void setKof(int kof) {
        this.kof = kof;
    }

    public DiWo getStat() {
        return stat;
    }

    public void setStat(DiWo stat) {
        this.stat = stat;
    }

    public int getStag() {
        return stag;
    }

    public void setStag(int stag) {
        this.stag = stag;
    }

    public int getBasestavka() {
        return basestavka;
    }

    public void setBasestavka(int basestavka) {
        this.basestavka = basestavka;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}



