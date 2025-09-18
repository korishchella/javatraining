package org.example;

public class Main {
    public static void main(String[] args){
        BankAccount acc1 = new SavingsAcc("Sohan", "101", 4000);
        BankAccount acc2 = new CurrentAcc("Reddy", "102", 2500);
        BankingService service = new BankingService();
        System.out.println(" Savings Account Transactions ");
        service.processTransaction(acc1,1000, 5000);
        System.out.println("Current Account Transactions ");
        service.processTransaction(acc2,1000, 1500);
    }
}
