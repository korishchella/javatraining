package org.example;

public class ArmstrongNos {
    public static void main(String[] args){
        System.out.println("List of all 3 & 4 digit armstrong no.s : ");
        for (int i=100; i<10000; i++){
            if (isArmstrong(i) == true)
                System.out.println(i);
        }
    }

    public static boolean isArmstrong(int x){
        int NOD = nod(x);
        int sum = 0;
        int num = x;
        while (x>0){
            int digit = x%10 ;
            sum = sum + (int)Math.pow(digit,NOD);
            x = x/10;
        }
        if (sum == num)
        return true ;
        else
            return false ;
    }
    public static int nod(int num){
        int n = 0;
        while (num >0){
            n ++ ;
            num = num / 10;
        }
        return n;
    }
}
