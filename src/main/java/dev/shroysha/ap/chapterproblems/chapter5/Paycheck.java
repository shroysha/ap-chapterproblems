package dev.shroysha.ap.chapterproblems.chapter5;

import lombok.Getter;

public class Paycheck {


    @Getter
    private final double pay;

    public Paycheck(double hourlyWage, double hours) {
        double overtimeHours = 0;

        if ((hours - 40) >= 0) {
            overtimeHours = hours - 40;
            hours = 40;
        }

        pay = (hourlyWage * hours) + (overtimeHours * hourlyWage * 1.5);
    }

}
