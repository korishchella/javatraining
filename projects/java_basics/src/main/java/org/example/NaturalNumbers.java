package org.example;

public class NaturalNumbers {

    public static void main(String[] args) {
        int i = 2, start=1,end=100;
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1 and numbers less than 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible, it is not prime
            }
        }
        return true;
    }
}