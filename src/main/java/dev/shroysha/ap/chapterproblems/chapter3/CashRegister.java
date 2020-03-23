package dev.shroysha.ap.chapterproblems.chapter3;

import lombok.Getter;

public class CashRegister {

    private double purchase;
    private double payment;
    @Getter
    private double totalTax;
    private double taxRate;

    /**
     * Constructs a cash register with no money in it.
     */
    public CashRegister(double rate) {
        purchase = 0;
        taxRate = rate / 100;
    }

    public void recordPurchase(double amount) {
        purchase = purchase + amount;
    }

    public void recordTaxablePurchase(double amount) {
        recordPurchase(amount);
        totalTax += (taxRate * amount);
    }

    public void enterPayment(double amount) {
        payment = amount;
    }

    public double giveChange() {
        double change = payment - (purchase + getTotalTax());
        purchase = 0;
        payment = 0;
        totalTax = 0;
        taxRate = 0;
        return change;
    }

}
