package org.example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAcc("Rohith", "SA101", 2000);
        BankAccount acc2 = new CurrentAcc("Sai", "CA102", 1500);
        BankService service = new BankService();
        System.out.println("------- Savings Account Transactions -------");
        service.processTransaction(acc1,1000, 5000);
        System.out.println("------- Current Account Transactions -------");
        service.processTransaction(acc2,1000, 1500);
    }
}
