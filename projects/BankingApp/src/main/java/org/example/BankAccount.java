package org.example;

public abstract class BankAccount {
    private String accHolder ;
    private String accNo ;
    private double accBalance ;

    BankAccount(String accHolder, String accNo, double accBalance){ // constructor
        this.accHolder = accHolder ;
        this.accNo = accNo ;
        this.accBalance = accBalance ;
    }

    public String getAccHolder() {

        return this.accHolder;
    }

    public String getAccNo() {

        return this.accNo;
    }

    public double getAccBalance() {

        return this.accBalance;
    }

    public void setAccBalance(double accBalance){
        this.accBalance = accBalance ;
    }

    public abstract void withdraw(double amount);// atleast one method abstract => class must be abstract
    public abstract void deposit(double amount);
}
