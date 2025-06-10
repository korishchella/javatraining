package org.example;

public class PreeDecrement {
    public static void main(String[] args) {

        int num1 = 15, num2 = 20;

        int postNum = num1--; // Post Decrement
        int preNum = --num2; // Pre Decrement

        System.out.println("postNum ="+ postNum);
        System.out.println("num1 ="+ num1);

        System.out.println("\n");

        System.out.println("preNum = "+ preNum);
        System.out.println("num2 ="+ num2);

        }
    }
