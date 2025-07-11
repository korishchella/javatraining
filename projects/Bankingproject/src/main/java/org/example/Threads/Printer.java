package org.example.Threads;

public class Printer {
    public static void main(String[] args) {
        ThreadsPrint1to10 ob1 = new ThreadsPrint1to10();
        ob1.start();

        ThreadsPrint11to20 ob2 = new ThreadsPrint11to20();
        Thread t = new Thread(ob2);
        t.start();

    }
}
