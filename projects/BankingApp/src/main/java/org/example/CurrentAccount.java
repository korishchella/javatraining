package org.example;

public class CurrentAccount extends BankAccount{

    CurrentAccount(String accHolder, String accNo, double accBalance){
        super (accHolder, accNo, accBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 20000){
            double balance = getAccBalance() - amount;
            setAccBalance(balance);
            System.out.println("Successfully withdrawn amount " + amount + " from current account. New balance is : " + balance);
        }
        else{
            System.out.println("You cannout withdraw more than 20000. ");
        }

    }

    @Override
    public void deposit(double amount) {
        setAccBalance(getAccBalance());
        double newAmount = amount + getAccBalance();
        setAccBalance(newAmount);
        System.out.println("Deposited " + amount +  ". New balance is : " + newAmount);

    }
}
