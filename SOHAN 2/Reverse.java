package org.example;

public class Reverse {
    public static void main(String args[])
    {
        int num=1234;
        int orgNum=num;
        int rev=0;
        while(num !=0)
        {
            int digit=num % 10;
            rev= rev *10 + digit;
            num /=10;

        }

        System.out.println("The orginal number is "+ num);
        System.out.println("The reversed number is "+ rev);
    }
}
