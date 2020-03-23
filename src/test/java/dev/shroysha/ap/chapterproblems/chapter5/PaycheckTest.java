package dev.shroysha.ap.chapterproblems.chapter5;

import java.util.Scanner;

public class PaycheckTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hourly wage: ");
        double hourlyWage = in.nextDouble();
        System.out.println("Hours worked: ");
        double hours = in.nextDouble();

        Paycheck aPayCheck = new Paycheck(hourlyWage, hours);
        System.out.println("Pay: " + aPayCheck.getPay());
    }

}
