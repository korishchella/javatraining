package org.example;

public class PrimeNos {
    public  static void main (String[] args){
        int n = 100;
        for (int i=2; i<=100; i++){
            int nof = numberOfFactors(i);
            if (nof == 0)
                System.out.println(i);
        }

    }
    public static int numberOfFactors(int x){
        int NOF=0 ;

        for (int i=2; i<x;i++){
            if (x%i == 0)
                NOF ++ ;
        }
        return NOF;

    }
}
