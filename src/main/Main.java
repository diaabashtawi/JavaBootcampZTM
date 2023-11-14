package main;

import bank.BankAccount;
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(2345);
        bankAccount.setAccountHolder("Deya Bakheet");
        bankAccount.setBalance(9000.00);

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getAccountHolder());
        System.out.println(bankAccount.getBalance());
    }
}