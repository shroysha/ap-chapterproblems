package dev.shroysha.ap.chapterproblems.chapter3;

import lombok.Getter;

public class Employee {

    @Getter
    private final String name;
    @Getter
    private double salary;


    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }


    public void raiseSalary(double percent) {
        salary *= 1 + percent / 100;
    }

}
