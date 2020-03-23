package dev.shroysha.ap.chapterproblems.chapter3;

import lombok.Getter;

/**
 * A bank account has a balance that can be changed by
 * deposits and withdrawals.
 */
public class BankAccount {

    @Getter
    private double balance;

    /**
     * Constructs a bank account with a zero balance
     */
    public BankAccount() {
        balance = 0;
    }


    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }


}
