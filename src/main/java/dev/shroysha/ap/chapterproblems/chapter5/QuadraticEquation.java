package dev.shroysha.ap.chapterproblems.chapter5;

import lombok.Getter;

public class QuadraticEquation {

    @Getter
    private boolean solutionReal = false;
    @Getter
    private double solution1 = 0, solution2 = 0;

    public QuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            solution1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            solution2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            if (solution1 > solution2) {
                double temp = solution1;
                solution1 = solution2;
                solution2 = temp;
            }
            solutionReal = true;
        }
    }



}
