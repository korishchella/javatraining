package org.example;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("Varshita", "VA107", 15000);
        BankAccount acc2 = new CurrentAccount("Pooja", "PO102", 12000);
        BankService service = new BankService();

        System.out.println("-------- Savings Account Transactions --------");
        service.processTransaction(acc1, 10000, 5000);

        System.out.println("-------- Current Account Transactions --------");
        service.processTransaction(acc2, 16000, 25000);
    }
}
