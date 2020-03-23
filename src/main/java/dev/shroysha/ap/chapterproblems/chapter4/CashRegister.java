package dev.shroysha.ap.chapterproblems.chapter4;

public class CashRegister {

    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;

    private double purchase;
    private double payment;

    /**
     * Constructs a cash register with no money in it.
     */
    public CashRegister() {
        purchase = 0;
        payment = 0;
    }


    public void recordPurchase(double amount) {
        purchase = purchase + amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    public void enterDollars(int dollars) {
        payment += dollars;
    }

    public void enterQuarters(int quarters) {
        payment += quarters * QUARTER_VALUE;
    }

    public void enterDimes(int dimes) {
        payment += dimes * DIME_VALUE;
    }

    public void enterNickels(int nickels) {
        payment += nickels * NICKEL_VALUE;
    }

    public void enterPennies(int pennies) {
        payment += pennies * PENNY_VALUE;
    }

}
