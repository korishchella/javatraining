package org.example.Threads;

import java.time.Duration;

public class ThreadsPrint1to10  extends Thread {
    @Override
    public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {

                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    throw  new RuntimeException(e);

                }
            }
        }
    }
