package org.example;

public abstract class BankAccount {
    private String accHolder;
    private String accNumber;
    private double accBalance;
    BankAccount(String accHolder,String accNumber,double accBalance){
        this.accHolder=accHolder;
        this.accNumber=accNumber;
        this.accBalance=accBalance;
    }
    public String getAccHolder(){
        return this.accHolder;
    }
    public String getAccNumber(){
        return this.accNumber;
    }
    public double getAccBalance(){
        return this.accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);


}
