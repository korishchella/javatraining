package org.example.Threads.IplTickets;

public class Thread101to200 implements Runnable {
    @Override
    public void run() {
        for (int i = 101; i <= 200; i++) {
            System.out.println(i);
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}