package org.example;

public abstract class BankAccount {
    private String accHolder;
    private String accNum;
    private double accBal;
    BankAccount(String accHolder, String accNum, double accBal){
        this.accHolder = accHolder;
        this.accNum = accNum;
        this.accBal = accBal;

    }
    public String getAccHolder(){
        return this.accHolder;
    }
    public String getAccNum(){
        return this.accNum;
    }
    public double getAccBal(){
        return this.accBal;
    }

    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
}
