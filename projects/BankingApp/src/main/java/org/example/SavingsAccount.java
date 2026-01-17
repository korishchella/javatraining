package org.example;

public class SavingsAccount extends BankAccount{

    SavingsAccount(String accHolder, String accNo, double accBalance){
        super(accHolder, accNo, accBalance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount > getAccBalance()){
            System.out.println("Insufficient Funds in savings account.");
        }
        else {
        double currentBalance = getAccBalance() - amount;
        setAccBalance(currentBalance);
        System.out.println("Successfully withdrawn amount " + amount + "from savings account. New Balance is : " + currentBalance );
        }
    }

    @Override
    public void deposit(double amount) {
        double interest = 0.05;
        double amtWithInterest = amount + (amount*interest);
        setAccBalance(amtWithInterest + getAccBalance());
        System.out.println("Deposited " + amount + " with interest " + interest + " New balance is : " + getAccBalance());
    }
}
