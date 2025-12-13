package com.kce.java.ex;

class SavingsAccount extends BankAccount {
    void addInterest() {
        balance += balance * 0.05;
        System.out.println("Interest added");
    }
}
