package com.TMS.Less5;

public class DirWor {

    public static void main(String[] args) {

        Worker worker1 = new Worker("Vera", "valeragg", DiWo.WORKER, 5, 12);
        Worker worker2 = new Worker("Tolia", "Toll", DiWo.WORKER, 10, 12);
        Worker worker3 = new Worker("Oleg", "Ole", DiWo.WORKER, 2, 12);
        Director director1 = new Director("Boss", "Bos", DiWo.DIRECTOR, 15, 12);
        Director director2 = new Director("Boss1", "Bos1", DiWo.DIRECTOR, 20, 12);
        worker1.returnSalary();

        director1.addWorker(new Worker[]{worker1, worker2});
        director1.returnSalary();
        System.out.println(director1);

    }


}
