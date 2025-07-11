package org.example.Threads;

import java.time.Duration;

public class ThreadsPrint11to20 extends Thread{
    @Override
      public void run(){
            for(int i=11;i<=20;i++){
                System.out.println(i);

                try {

                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
              }
            }

        }


