package org.example;

public class AddnNumber {
        // main function
        public static void main(String[] args)
        {
            int N = 4;
            System.out.println("Finding Sum of " + N + " Numbers using Mathematical Formulae");

            // Calculating the sum
            int sum = (N*(N+1))/2;

            // Printing the result
            System.out.println("Sum of first " + N
                    + " Natural Numbers = " + sum);
        }
    }
