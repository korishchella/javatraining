package org.example;

public class BankingService {
    public void processTransaction(BankAccount account, double depositedAmount, double withDrawnAmount) {
        account.deposit(depositedAmount);
        account.withdraw(withDrawnAmount);

    }
}
