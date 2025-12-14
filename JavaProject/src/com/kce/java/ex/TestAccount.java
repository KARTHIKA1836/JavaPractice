package com.kce.java.ex;

public class TestAccount {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.deposit(1000);
        acc1.showBalance();
        System.out.println("Amount Deposited ");
        SavingsAccount sa1 = new SavingsAccount();
        sa1.deposit(2000);
        sa1.addInterest();
        sa1.showBalance();
        BankAccount acc2 = new SavingsAccount();
        acc2.deposit(3000);
        acc2.showBalance();
        System.out.println("Amount Deposited ");
        BankAccount acc3 = new CurrentAccount();
        acc3.deposit(4000);
        acc3.showBalance();
        System.out.println("Amount Deposited ");
        CurrentAccount ca1 = new CurrentAccount();
        ca1.deposit(5000);
        ca1.overdraft();
        ca1.showBalance();
        BankAccount acc4 = new SavingsAccount();
        acc4.deposit(6000);

        if (acc4 instanceof SavingsAccount) {
            SavingsAccount sa2 = (SavingsAccount) acc4;
            sa2.addInterest();
        }
        acc4.showBalance();
    }
}
