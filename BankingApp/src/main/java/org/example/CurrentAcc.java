package org.example;

public class CurrentAcc extends BankAccount{
    CurrentAcc(String accHolder,String accNumber,double accBalance){
        super(accHolder,accNumber,accBalance);
    }
    public void withdraw(double amount){
        if(amount>1000){
            System.out.println("Amount withdrawl is allowed only when amount is less then 1000");
        }
        else{
            double currentBalance = getAccBalance() - amount;
            setAccBalance(currentBalance);
            System.out.println("The amount of :"+amount+" is successfully withdrawn from current acc.New balance is:"+currentBalance);
        }
    }


    public void deposit(double amount) {
        double newAmount = amount + getAccBalance();
        setAccBalance(newAmount);
        System.out.println("Deposited "+amount+" into current acc. New balance is :"+newAmount);

    }
}