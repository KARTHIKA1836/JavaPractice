package com.kce.java.ex;

class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

