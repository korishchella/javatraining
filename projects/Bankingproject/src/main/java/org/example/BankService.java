package org.example;

public class BankService {
    public void processTransaction(BankAccount account, double depositedAmount, double withDrawnAmount) {
        account.deposit(depositedAmount);
        account.withdraw(withDrawnAmount);
    }
}
