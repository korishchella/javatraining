package org.example;

public class CurrentAcc extends BankAccount{
    CurrentAcc(String accHolder, String accNum, double accBalance){
        super(accHolder,accNum,accBalance);
    }

    @Override
    public void withdraw(double amount) {
        if(amount<1000){
            double bal =  getAccBal() - amount;
            setAccBal(bal);
            System.out.println("Successfully Withdrawn Amount " + amount + " From Current Account. New Balance is -" + bal);
        }else{
            System.out.println("You Cannot Withdraw More Than 1000");

        }
    }

    @Override
    public void deposit(double amount) {
        double newAmount = amount+ getAccBal();
        setAccBal(newAmount);
        System.out.println("Deposited " + amount + " New Balance Is: "+ newAmount);
    }

}
