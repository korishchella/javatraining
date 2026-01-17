package org.example;

public class Fibnacci {

    public static void main (String[] args){
        int f0 = 0;
        int f1 = 1;
        int n = 10; // number of terms

        System.out.println("first 10 no.s of fibonacci series : " );
        System.out.println(f0);
        System.out.println(f1);

        for (int i=3; i<=10; i++){
            int f2 = f0 + f1 ;
            System.out.println(f2);
            f0 = f1;
            f1 = f2;


        }




    }

}
