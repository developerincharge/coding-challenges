package com.rizvi.oops.bank;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "John Doe");
        System.out.println("Initial Balance: " + account.getBalance());

        account.depositMoney(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        try {
            account.withdrawMoney(600.0);
            System.out.println("Balance after withdrawal: " + account.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
