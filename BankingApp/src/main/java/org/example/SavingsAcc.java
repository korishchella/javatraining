package org.example;

public class SavingsAcc extends BankAccount{
    SavingsAcc(String accHolder,String accNumber,double accBalance){
        super(accHolder,accNumber,accBalance);
    }


    public void withdraw(double amount) {
        if(amount>getAccBalance()){
            System.out.println("insufficient funds in savings account");
        }
        else{
            double currentBalance = getAccBalance() - amount;
            setAccBalance(currentBalance);
            System.out.println("The amount of :"+amount+" is successfully withdrawn from savings acc.New balance is:"+currentBalance);
        }
    }
    public void deposit(double amount) {
        double interest = 0.05;
        double amountWithIntrest= amount +(amount*interest);
        setAccBalance(amountWithIntrest+getAccBalance());
        System.out.println("Deposited "+amount+" into savings acc,with interest. New balance is :"+getAccBalance());



    }
}
