package com.kce.f230.encaps;

class BankAccount {
    private String accountNumber;
    private double balance;
    private int pin;

    public BankAccount(String accNo, int pin) {
        this.accountNumber = accNo;
        this.pin = pin;
        this.balance = 0;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }
    public void withdraw(double amount, int enteredPin) {
        if (enteredPin == pin) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful");
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Invalid PIN");
        }
    }
    public double getBalance(int enteredPin) {
        if (enteredPin == pin) {
            return balance;
        }
        return -1;
    }
}
