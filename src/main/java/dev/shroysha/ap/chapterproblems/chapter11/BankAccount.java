package dev.shroysha.ap.chapterproblems.chapter11;

public class BankAccount {

    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double initBalance) throws NegativeBalanceException {
        if (initBalance < 0)
            throw new NegativeBalanceException("A bank account can't start with a negative balance.");

        balance = initBalance;
    }


    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0)
            throw new NegativeAmountException("Trying to deposit a negative amount.");
        else
            balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < 0)
            throw new InsufficientFundsException("Insufficient funds.");
        else
            balance -= amount;
    }

    public static class InsufficientFundsException extends Exception {

        public InsufficientFundsException(String message) {
            super(message);
        }

        public InsufficientFundsException() {
            super();
        }

    }

    public static class NegativeAmountException extends Exception {

        public NegativeAmountException() {
            super();
        }

        public NegativeAmountException(String message) {
            super(message);
        }

    }

    public static class NegativeBalanceException extends Exception {

        public NegativeBalanceException() {
            super();
        }

        public NegativeBalanceException(String message) {
            super(message);
        }

    }
}
