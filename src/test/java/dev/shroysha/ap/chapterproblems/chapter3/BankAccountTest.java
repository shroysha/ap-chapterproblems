package dev.shroysha.ap.chapterproblems.chapter3;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount acct = new BankAccount();
        acct.deposit(1000);
        acct.withdraw(500);
        acct.withdraw(400);

        System.out.println(acct.getBalance());
        System.out.println("Expected: 100");
    }

}
