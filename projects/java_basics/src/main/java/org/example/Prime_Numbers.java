package org.example;

public class Prime_Numbers {
    public static void main(String args[]) {
        System.out.println("First 100 prime numbers are");

        for (int num = 2; num <= 100; num++) {
            boolean isPrime=true;

            for (int i = 2; i <=Math.sqrt(num); i++) {
                if (num % i==0){
                    isPrime = false;
                    break;
                }

            }
            if(isPrime){
                System.out.println(num +" ");
            }
        }
    }
}
