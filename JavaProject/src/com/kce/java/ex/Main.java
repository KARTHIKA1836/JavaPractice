package com.kce.java.ex;

public class Main {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        sa.deposit(1000);
        sa.addInterest();
        sa.showBalance();

        CurrentAccount ca = new CurrentAccount();
        ca.deposit(5000);
        ca.overdraft();
        ca.showBalance();
    }
}
