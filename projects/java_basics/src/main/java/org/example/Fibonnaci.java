package org.example;

public class Fibonnaci {
    public static void main(String args[])
    {
        int F=10;
        int First=0;
        int Second=1;
         System.out.println("Fibonnaci series of first 10 num is....");

         for(int i=1;i<=10;i++)
         {
             System.out.println(First + " ");
             int next = First + Second;
             First=Second;
             Second=next;

         }
    }
}
