package org.example.Threads;

public class ThreadsPrint11to20 extends Thread{
    @Override
      public void run(){
            for(int i=11;i<=20;i++){
                System.out.println(i);
            }

        }
    }

