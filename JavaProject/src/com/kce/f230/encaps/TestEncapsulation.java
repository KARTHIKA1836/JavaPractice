package com.kce.f230.encaps;

public class TestEncapsulation {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("ACC123", 1234);

        acc.deposit(5000);
        acc.withdraw(2000, 1234);

        System.out.println("Balance: " + acc.getBalance(1234));

        // Not allowed (Encapsulation protection)
        // acc.balance = 100000;
        // acc.pin = 1111;
    }
}
