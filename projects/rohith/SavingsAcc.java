package org.example;

public class SavingsAcc extends BankAccount {
    SavingsAcc(String accHolder, String accNum, double accBalance){
        super(accHolder,accNum,accBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount>getAccBal()){
            System.out.println("Insufficient Funds In Savings Account");
        }else{
          double currentBal =  getAccBal() - amount;
          setAccBal(currentBal);
          System.out.println("Successfully Withdrawn Amount " + amount + " From Savings Account. New Balance is -" + currentBal);
        }
    }

    @Override
    public void deposit(double amount) {
        double interest = 0.05;
        double amountWithInterest = amount + (amount * interest);
        setAccBal(amountWithInterest +getAccBal());
        System.out.println("Deposited " + amount +" With Interest:"+ interest + " New Balance Is: "+getAccBal());

    }
}
