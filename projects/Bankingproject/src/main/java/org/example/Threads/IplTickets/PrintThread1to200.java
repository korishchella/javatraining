package org.example.Threads.IplTickets;

public class PrintThread1to200 {
    public static void main(String arry[]){

        Thread1to100 ob1 = new Thread1to100();
        Thread t1 = new Thread(ob1);
        t1.start();

        Thread101to200 ob2 = new Thread101to200();
        Thread t2 = new Thread(ob2);
        t2.start();





    }
}
