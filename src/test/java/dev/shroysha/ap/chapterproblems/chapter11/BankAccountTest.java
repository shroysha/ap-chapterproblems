package dev.shroysha.ap.chapterproblems.chapter11;

public class BankAccountTest {


    public static void main(String[] args) {

        BankAccount harrysChecking = new BankAccount();

        try {
            harrysChecking = new BankAccount(-500);
            System.out.println("success");
        } catch (BankAccount.NegativeBalanceException e) {
            System.out.println("exception");
        }
        System.out.println("Expected: exception");

        try {
            harrysChecking.deposit(-100);
            System.out.println("success");
        } catch (BankAccount.NegativeAmountException e) {
            System.out.println("exception");
        }
        System.out.println("Expected: exception");

        try {
            harrysChecking.withdraw(100);
            System.out.println("success");
        } catch (BankAccount.InsufficientFundsException e) {
            System.out.println("exception");
        }
        System.out.println("Expected: exception");
    }
    
}
