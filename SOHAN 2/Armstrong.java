package org.example;

public class Armstrong {

        public static void main(String[] args) {
        // First input
        int number1 = 153;
        checkArmstrong(number1);

        // Second input
        int number2 = 123;
        checkArmstrong(number2);
    }

        // Method to check if number is Armstrong
        public static void checkArmstrong(int number) {
        int originalNumber = number;
        int result = 0;

        // Calculate number of digits
        int n = String.valueOf(number).length();

        // Calculate sum of nth powers of digits
        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }

        // Print result
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
    }


